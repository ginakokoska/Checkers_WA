const app = Vue.createApp({
    data() {
        return {
            vueWebsocket: new WebSocket("ws://" + location.hostname + ":9000/websocket"),
            data: {},
            game: data.game,
        }
    },
    methods: {
        connectWebSocket() {
            this.vueWebsocket.onopen = (event) => {
                this.vueWebsocket.send("Connect to server");
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
                // TODO: HERE IDK gameoboard, site etc ?
                this.checkWin()
                this.updateGameboard()
            };
        },
        processCommand(cmd, returnData) {
            this.post("POST", "/command", {"cmd": cmd, "data": returnData }, cmd).then(() => {
            })
        },
        post(method, url, returnData, cmd)
        {
            return $.ajax({
                method: method,
                url: url,
                data: JSON.stringify(returnData),
                dataType: "json",
                contentType: "application/json",

                success: function (response) {
                    data = response;
                },
                error: function (response) {
                    console.log("Error")
                    console.error(response);
                }
            });
        },
        processCmdWS(cmd, data) {
            this.vueWebsocket.send(cmd + "|" + data)
        },
        checkWin() {
            let gamestate = data.game.gameState
            if (gamestate in ["BLACK_WON", "WHITE_WON"]) {
                let winner = (gamestate === "WHITE_WON" ? "White" : "Black")
                swal({
                    icon: "info",
                    text: winner + " has won the game.",
                    title: "Title"
                })
            }

        },
        updateGameBoard() {

            size = data.game.gameBoard.size;
            let newGame = $('#gamecontainer');
            newGame.html('');
            let newContent = '';
            //newContent += '<div class="gamecontainer" id="gamecontainer">';
            newContent += '<div class="game">';
            for(let row=0; row < data.game.gameBoard.size; row++) {
                newContent += '<div class="fieldrow">';
                for(let col=0; col < data.game.gameBoard.size; col++) {


                    if ((row+col+data.game.gameBoard.size)%2 === 0) {
                        newContent += '<div class="field" style="background-color: #641403">';
                    } else {
                        newContent += '<div class="field" style="background-color: #000000">';
                    }

                    let scalar = row*size+col
                    let color = data.game.gameBoard.fields[scalar].field.piece.color;
                    let state = data.game.gameBoard.fields[scalar].field.piece.state;

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
                            newContent += '<img class="img" alt=""/>';
                            newContent += '</div>';
                            break;
                    }

                }
                newContent += '</div>'
            }

            newContent += '</div></div>';
            newGame.html(newContent);
        },
        getData() {
            size = data.game.gameBoard.size;
            let newGame = $('#gamecontainer');
            newGame.html('');
            let newContent = '';
            //newContent += '<div class="gamecontainer" id="gamecontainer">';
            newContent += '<div class="game">';
            for(let row=0; row < data.game.gameBoard.size; row++) {
                newContent += '<div class="fieldrow">';
                for(let col=0; col < data.game.gameBoard.size; col++) {


                    if ((row+col+data.game.gameBoard.size)%2 === 0) {
                        newContent += '<div class="field" style="background-color: #641403">';
                    } else {
                        newContent += '<div class="field" style="background-color: #000000">';
                    }

                    let scalar = row*size+col
                    let color = data.game.gameBoard.fields[scalar].field.piece.color;
                    let state = data.game.gameBoard.fields[scalar].field.piece.state;

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
                            newContent += '<img class="img" alt=""/>';
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
        this.getData();
        this.connectWebSocket();
    },
})

app.config.globalProperties.size = 8

app.component('gamecontainer', {
    template: ` <div className="gamecontainer" id="gamecontainer">
        <div className="game">
            @for(row <- 0 until size) {
            <div className="fieldrow">
                @for(col <- 0 until size) {
                <div className="field" id="field@{row*size+col}">
                    <img className="img" id="scalar@{row*size+col}" alt=""/>
                </div>
            }
            </div>
        }
        </div>
    </div>
    `
})

app.component('form-group', {
    template: `<div className="form-group" id="form-group">
        <label htmlFor="text-input"> </label>
        <input type="text" className="form-control" id="text-input" placeholder="Enter your move like 'XX YY'" onFocus="this.placeholder = ''" input-focus-border-color="#99999">
            <div style="padding:20px"></div>
            <button onClick="jsMove()" type="button" className="btn bouncy"> Enter</button>
            <p id="message-field">@{message} </p>
    </div>
    `
})

app.mount('#gamecontainer')