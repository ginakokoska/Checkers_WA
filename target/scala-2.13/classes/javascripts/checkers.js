
// for Ajax
$(document).ready(function() {
        getData().then(() => {
            testPrint();
            checkWin();
            setScalarCol();
            updateGameboard();
            //refreshOnClickEvents();
        })
    }
)

// for webserver ??
function processCommand(cmd, data) {
    post("POST", "/command", {"cmd": cmd, "data": data}).then(() => {
        getData().then(() => {
            checkWin();
            setScalarCol();
            updateGameboard();
            //refreshOnClickEvents();
        })
    })
}

/*idee yannick*/
// pop up message here ?
function newBoard(num) {
    processCommand("size", num)
}

// how to implement that current page is 8 or 10
// where the fuck is the popup message ??
function resetGame() {
    if (confirm("Are you sure you want to continue? Starting a new game means that current progress will be lost!")) {
        if (data.size === 8) {
            processCommand("newGrid", 8)
        } else {
            processCommand("newGrid", 10)
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

function post(method, url, data) {
    return $.ajax({
        method: method,
        url: url,
        data: JSON.stringify(data),
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

// document.getElementById("scalar{i}").bgcolor="{color}";
// function mit % um jedes zweite feld als rot oder als schwarz zu haben


function setScalarCol() {
    for (let scalar=0; scalar < data.game.gameBoard.size*data.game.gameBoard.size; scalar++) {
        //val x = (scalar+data.game.gameBoard.size)
        let col = scalar % data.game.gameBoard.size;
        let row = Math.floor(scalar / data.game.gameBoard.size);
        if ((row+col+data.game.gameBoard.size)%2 === 0) {
            $('#' + "field" + scalar).attr("style", "background-color: #641403");
            console.log("in set Scalar")
        } else {
            $('#' + "field" + scalar).attr("style", "background-color: #000000");
        }
    }
}

// {"game":
// {"gameState":
// "WHITE_TURN","gameBoard":
// {"size":8,"fields":
// [{"row":0,"col":0,"field":{"pos":"A1","piece":{"state":"normal","prow":0,"pcol":0,"color":"black"}}},

function updateGameboard() {
    for (let scalar=0; scalar < data.game.gameBoard.size*data.game.gameBoard.size; scalar++) {
        let row = data.game.gameBoard.fields[scalar].row
        let col = data.game.gameBoard.fields[scalar].col
        let fieldID = "scalar" + scalar
        let color = data.game.gameBoard.fields[scalar].field.piece.color
        let state = data.game.gameBoard.fields[scalar].field.piece.state

        if (state !== "") {
            switch (state) {
                case "normal":
                    $('#' + fieldID).attr("src", "/assets/images/" + color + ".png");
                    break;
                case "queen":
                    $('#' + fieldID).attr("src", "/assets/images/" + color + "_queen.png");
                    break;
            }
        }

    }
}







