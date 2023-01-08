const app = Vue.createApp({
    data() {
        return {
            vueWebsocket: new WebSocket("ws://" + location.hostname + ":9000/websocket"),
            data: {},
            game: {"gameState": "WHITE_TURN", "gameBoard":{"size": 8, "fields":[]}},
            gameBoard: "",
            size: 8,
        }
    },
    methods: {
        connectWebSocket() {
            this.vueWebsocket.onopen = (event) => {
                this.vueWebsocket.send("Connect to server");
                console.log("connecting to server")
            }

            this.vueWebsocket.onclose = (event) => {
                this.vueWebsocket.send("reset", "")
            };

            this.vueWebsocket.onerror = (event) => {
            };

            this.vueWebsocket.onmessage = (event) => {
                if (typeof event.data === "string") {
                    this.data = JSON.parse(event.data)
                    if (this.data.reset === 1) {
                    }
                }
                this.game = this.data.game
                this.gameBoard = this.data.game.gameBoard
                this.size = this.data.game.gameBoard.size
                // TODO: HERE IDK gameoboard, site etc ?
                this.checkWin()
                this.updateGameBoard()
            };
        },
        processCmdWS(cmd, data) {
            this.vueWebsocket.send(cmd + "|" + data + "|")
        },
        processCommand(cmd, returnData) {
            this.post("POST", "/command", {"cmd": cmd, "data": returnData}, cmd).then(() => {
            })
        },
        post(method, url, returnData, cmd)
        {
            return $.ajax({
                method: method,
                url: url,
                crossDomain: true,
                data: JSON.stringify(returnData),
                dataType: "json",
                contentType: "application/json",

                success: function (response) {
                    this.data = response;
                },
                error: function (response) {
                    console.log("Error")
                    console.error(response);
                }
            });
        },
        checkWin() {
            let gamestate = this.data.game.gameState
            if (gamestate in ["BLACK_WON", "WHITE_WON"]) {
                let winner = (gamestate === "WHITE_WON" ? "White" : "Black")
                swal({
                    icon: "info",
                    text: winner + " has won the game.",
                    title: "Title"
                })
            }

        },
        newBoard(num) {
            this.processCmdWS("newBoard", num)
        },
        jsMove() {
            let mv = $('#text-input').val();
            console.log(mv)
            this.processCmdWS("jsMove", mv)
        },
        updateGameBoard() {
            this.size = this.data.game.gameBoard.size;
            let newGame = $('#gamecontainer');
            newGame.html('');
            let newContent = '';
            //newContent += '<div class="gamecontainer" id="gamecontainer">';
            newContent += '<div class="game">';
            for(let row=0; row < this.data.game.gameBoard.size; row++) {
                newContent += '<div class="fieldrow">';
                for(let col=0; col < this.data.game.gameBoard.size; col++) {

                    if ((row+col+this.data.game.gameBoard.size)%2 === 0) {
                        newContent += '<div class="field" style="background-color: #641403">';
                    } else {
                        newContent += '<div class="field" style="background-color: #000000">';
                    }

                    let scalar = row*this.size+col;

                    let color = this.data.game.gameBoard.fields[scalar].field.piece.color;
                    let state = this.data.game.gameBoard.fields[scalar].field.piece.state;

                    switch (state) {
                        case "normal":
                            newContent += '<img class="img" src="/assets/images/' + color + '.png" alt=""/>';
                            newContent += '</div>';
                            break;
                        case "queen":
                            newContent += '<img class="img" src="/assets/images/' + color + '_queen.png" alt=""/>';
                            newContent += '</div>';
                            break;
                        default:
                            newContent += '<img class="img" src="/assets/images/empty.png" alt=""/>';
                            newContent += '</div>';
                            break;
                    }

                }
                newContent += '</div>'
            }

            newContent += '</div></div>';
            newGame.html(newContent);
            let msg = $('#message-field');
            msg.html(this.data.game.message);
        },
        gotData() {
            let that = this;
            return $.ajax({
                method: "GET",
                url: "/current",
                crossDomain: true,
                dataType: "json",

                success: function (response) {
                    that.data = response;
                    that.size = response.game.gameBoard.size;
                    that.getData();
                },
                error: function (response) {
                    console.log("Error")
                    console.error(response);
                }
            });

        },
        getData() {
            let newGame = $('#gamecontainer');
            newGame.html('');
            let newContent = '';
            //newContent += '<div class="gamecontainer" id="gamecontainer">';
            newContent += '<div class="game">';
            for(let row=0; row < this.size; row++) {
                newContent += '<div class="fieldrow">';
                for(let col=0; col < this.size; col++) {


                    if ((row+col+this.size)%2 === 0) {
                        newContent += '<div class="field" style="background-color: #641403">';
                    } else {
                        newContent += '<div class="field" style="background-color: #000000">';
                    }

                    let scalar = row*this.size+col;
                    let color = this.data.game.gameBoard.fields[scalar].field.piece.color;
                    let state = this.data.game.gameBoard.fields[scalar].field.piece.state;

                    switch (state) {
                        case "normal":
                            newContent += '<img class="img" src="/assets/images/' + color + '.png" alt=""/>';
                            newContent += '</div>';
                            break;
                        case "queen":
                            newContent += '<img class="img" src="/assets/images/' + color + '_queen.png" alt=""/>';
                            newContent += '</div>';
                            break;
                        default:
                            newContent += '<img class="img" src="/assets/images/empty.png" alt=""/>';
                            newContent += '</div>';
                            break;
                    }

                }
                newContent += '</div>'
            }

            newContent += '</div></div>';
            newGame.html(newContent);

        }


    },
    created() {
        this.gotData();
        this.connectWebSocket();
    },
})


app.component('navbar',  {
    data() {
        return {
            homeLink: "/",
            instructionsLink: "/instructions",
            smallGridLink: "/new8Grid",
            bigGridLink: "/new10Grid"
        }
    },

    template: `
  <nav class="navbar navbar-dark bg-dark fixed-top">
  <div class="container-fluid">
    <a class="navbar-brand" href="http://localhost:9000/"> <i class="fa-solid fa-chess"></i> Checkers</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
      <div class="offcanvas-header">
        <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Checkers Menu</h5>
        <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
      </div>
      <div class="offcanvas-body">
        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
          <li class="nav-item">
            <a class="nav-link" aria-current="page" :href="homeLink"> <i class="fa-solid fa-igloo"></i> Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="https://github.com/ginakokoska/Checkers_WA"> <i class="fa-brands fa-github-alt"></i> GitHub</a>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="#" @click="$root.newBoard(8)"><i class="fa-solid fa-chess-queen"></i> 8x8</a>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="#" @click="$root.newBoard(10)"><i class="fa-regular fa-chess-queen"></i> 10x10</a>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="#" :href="instructionsLink"> <i class="fa-solid fa-clipboard-list"></i> User Manual</a>
          </li>
        </ul>
      </div>
    </div>
  </div>
</nav>
    `
})



app.component('gamecontainer', {
    template: `
    <div class="gamecontainer" id="gamecontainer">
        <div class="game">
             <li v-for="i in $root.size">
                <div class="fieldrow">
                    <li v-for="j in $root.size"> 
                        <div class="field" id="field{{i}}*$root.size+{{j}}">
                            <img class="img" id="scalar{{i}}*$root.size+{{j}}" alt=""/>
                        </div>
                    </li>
                </div>
             </li>     
        </div>
    </div>
    `
})


app.component('form-group', {
    template: `<div class="form-group" id="form-group">
        <label for="text-input"> </label>
        <input type="text" class="form-control" id="text-input" placeholder="Enter your move like 'XX YY'" onFocus="this.placeholder = ''" input-focus-border-color="#99999">
            <div style="padding:20px"></div>
            <button @click="$root.jsMove()" type="button" class="btn bouncy"> Enter</button>
            <p id="message-field"></p>
    </div>
    `
})


app.mount('#checkers')