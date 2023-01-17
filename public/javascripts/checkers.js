
// for Ajax
$(document).ready(function() {
        updateGame();
        connectWebSocket();
    }
)

function updateGame() {
    getData().then(() => {
        checkWin();
        updateGameboard();
        //refreshOnClickEvents();
    })
}

function updateGameNoAjax() {
    console.log("in ws command")
    checkWin();
    updateGameboard();
    //refreshOnClickEvents();
}


// for webserver ??
function processCommand(cmd, returnData) {
    post("POST", "/command", {"cmd": cmd, "data": returnData}).then(() => {
        getData().then(() => {
            checkWin();
            updateGameboard();
            //refreshOnClickEvents();
        })
    })
}

function processCmdWS(cmd, data) {
    websocket.send(cmd + "|" + data)
}

/*idee yannick*/
// pop up message here ?
function newBoard(num) {
    processCmdWS("newBoard", num)
}

function jsMove() {
    let mv = $('#text-input').val();
    processCmdWS("jsMove", mv)
}
// how to implement that current page is 8 or 10
// where the fuck is the popup message ??
function resetGame() {
    if (confirm("Are you sure you want to continue? Starting a new game means that current progress will be lost!")) {
        if (data.game.gameBoard.size === 8) {
            processCmdWS("newBoard", "8")
        } else {
            processCmdWS("newBoard", "10")
        }
    }
}


function testPrint() {
    console.log("test")
}



let data = {}
//let data = {"game":{"gameState":"WHITE_TURN","gameBoard":{"size":8,"fields":[{"row":0,"col":0,"field":{"pos":"A1","piece":{"state":"normal","prow":0,"pcol":0,"color":"black"}}},{"row":0,"col":1,"field":{"pos":"B1","piece":null}},{"row":0,"col":2,"field":{"pos":"C1","piece":{"state":"normal","prow":0,"pcol":2,"color":"black"}}},{"row":0,"col":3,"field":{"pos":"D1","piece":null}},{"row":0,"col":4,"field":{"pos":"E1","piece":{"state":"normal","prow":0,"pcol":4,"color":"black"}}},{"row":0,"col":5,"field":{"pos":"F1","piece":null}},{"row":0,"col":6,"field":{"pos":"G1","piece":{"state":"normal","prow":0,"pcol":6,"color":"black"}}},{"row":0,"col":7,"field":{"pos":"H1","piece":null}},{"row":1,"col":0,"field":{"pos":"A2","piece":null}},{"row":1,"col":1,"field":{"pos":"B2","piece":{"state":"normal","prow":1,"pcol":1,"color":"black"}}},{"row":1,"col":2,"field":{"pos":"C2","piece":null}},{"row":1,"col":3,"field":{"pos":"D2","piece":{"state":"normal","prow":1,"pcol":3,"color":"black"}}},{"row":1,"col":4,"field":{"pos":"E2","piece":null}},{"row":1,"col":5,"field":{"pos":"F2","piece":{"state":"normal","prow":1,"pcol":5,"color":"black"}}},{"row":1,"col":6,"field":{"pos":"G2","piece":null}},{"row":1,"col":7,"field":{"pos":"H2","piece":{"state":"normal","prow":1,"pcol":7,"color":"black"}}},{"row":2,"col":0,"field":{"pos":"A3","piece":{"state":"normal","prow":2,"pcol":0,"color":"black"}}},{"row":2,"col":1,"field":{"pos":"B3","piece":null}},{"row":2,"col":2,"field":{"pos":"C3","piece":{"state":"normal","prow":2,"pcol":2,"color":"black"}}},{"row":2,"col":3,"field":{"pos":"D3","piece":null}},{"row":2,"col":4,"field":{"pos":"E3","piece":{"state":"normal","prow":2,"pcol":4,"color":"black"}}},{"row":2,"col":5,"field":{"pos":"F3","piece":null}},{"row":2,"col":6,"field":{"pos":"G3","piece":{"state":"normal","prow":2,"pcol":6,"color":"black"}}},{"row":2,"col":7,"field":{"pos":"H3","piece":null}},{"row":3,"col":0,"field":{"pos":"A4","piece":null}},{"row":3,"col":1,"field":{"pos":"B4","piece":null}},{"row":3,"col":2,"field":{"pos":"C4","piece":null}},{"row":3,"col":3,"field":{"pos":"D4","piece":null}},{"row":3,"col":4,"field":{"pos":"E4","piece":null}},{"row":3,"col":5,"field":{"pos":"F4","piece":null}},{"row":3,"col":6,"field":{"pos":"G4","piece":null}},{"row":3,"col":7,"field":{"pos":"H4","piece":null}},{"row":4,"col":0,"field":{"pos":"A5","piece":null}},{"row":4,"col":1,"field":{"pos":"B5","piece":null}},{"row":4,"col":2,"field":{"pos":"C5","piece":null}},{"row":4,"col":3,"field":{"pos":"D5","piece":null}},{"row":4,"col":4,"field":{"pos":"E5","piece":null}},{"row":4,"col":5,"field":{"pos":"F5","piece":null}},{"row":4,"col":6,"field":{"pos":"G5","piece":null}},{"row":4,"col":7,"field":{"pos":"H5","piece":null}},{"row":5,"col":0,"field":{"pos":"A6","piece":null}},{"row":5,"col":1,"field":{"pos":"B6","piece":{"state":"normal","prow":5,"pcol":1,"color":"white"}}},{"row":5,"col":2,"field":{"pos":"C6","piece":null}},{"row":5,"col":3,"field":{"pos":"D6","piece":{"state":"normal","prow":5,"pcol":3,"color":"white"}}},{"row":5,"col":4,"field":{"pos":"E6","piece":null}},{"row":5,"col":5,"field":{"pos":"F6","piece":{"state":"normal","prow":5,"pcol":5,"color":"white"}}},{"row":5,"col":6,"field":{"pos":"G6","piece":null}},{"row":5,"col":7,"field":{"pos":"H6","piece":{"state":"normal","prow":5,"pcol":7,"color":"white"}}},{"row":6,"col":0,"field":{"pos":"A7","piece":{"state":"normal","prow":6,"pcol":0,"color":"white"}}},{"row":6,"col":1,"field":{"pos":"B7","piece":null}},{"row":6,"col":2,"field":{"pos":"C7","piece":{"state":"normal","prow":6,"pcol":2,"color":"white"}}},{"row":6,"col":3,"field":{"pos":"D7","piece":null}},{"row":6,"col":4,"field":{"pos":"E7","piece":{"state":"normal","prow":6,"pcol":4,"color":"white"}}},{"row":6,"col":5,"field":{"pos":"F7","piece":null}},{"row":6,"col":6,"field":{"pos":"G7","piece":{"state":"normal","prow":6,"pcol":6,"color":"white"}}},{"row":6,"col":7,"field":{"pos":"H7","piece":null}},{"row":7,"col":0,"field":{"pos":"A8","piece":null}},{"row":7,"col":1,"field":{"pos":"B8","piece":{"state":"normal","prow":7,"pcol":1,"color":"white"}}},{"row":7,"col":2,"field":{"pos":"C8","piece":null}},{"row":7,"col":3,"field":{"pos":"D8","piece":{"state":"normal","prow":7,"pcol":3,"color":"white"}}},{"row":7,"col":4,"field":{"pos":"E8","piece":null}},{"row":7,"col":5,"field":{"pos":"F8","piece":{"state":"normal","prow":7,"pcol":5,"color":"white"}}},{"row":7,"col":6,"field":{"pos":"G8","piece":null}},{"row":7,"col":7,"field":{"pos":"H8","piece":{"state":"normal","prow":7,"pcol":7,"color":"white"}}}]}}}

function getData() {
    return $.ajax({
        method: "GET",
        url: "/current",
        dataType: "json",
        success: function (response) {
            data = response;
        }
    });
}

function post(method, url, returnData) {
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
}

function checkWin() {
    let gamestate = data.game.gameState
    if (gamestate in ["BLACK_WON", "WHITE_WON"]) {
        let winner = (gamestate === "WHITE_WON" ? "White" : "Black")
        $('#testAudio').get(0).pause();
        let audio = $('#winAudio').get(0);
        audio.loop = true;
        audio.play();
        swal({
            icon: "info",
            text: winner + " has won the game.",
            title: "Title"
        })
    }
}

let size = 8
//let gameboard = new Gameboard(size)



function updateGameboard() {

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



let websocket = new WebSocket("wss://heroku:9000/websocket");
window.onbeforeunload = function () { // Für Chrome Bug
    websocket.onclose = function () {
        processCommand("resetGame", "");
    };
    websocket.close();
};

function connectWebSocket() {

    websocket.onopen = function (event) {
        websocket.send("Trying to connect to Server");
    }

    websocket.onclose = function () {
        processCommand("resetGame", "");
    };

    websocket.onerror = function (error) {
    };

    websocket.onmessage = function (e) {
        console.log("onmessage")
        if (typeof e.data === "string") {
            console.log("inmessage")
            data = JSON.parse(e.data);
            console.log(data)
            if (data.game.gameState === "RESET") { // reset variable
                swal({
                    icon: "warning",
                    text: "Game has been reset!",
                    title: "Error!"
                })
            }
            updateGameNoAjax();
        }
    };

}
