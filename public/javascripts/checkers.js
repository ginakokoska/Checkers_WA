
// for Ajax
$(document).ready(function() {
        getData().then(() => {
            //checkWin();
            setScalarCol();
            updateGameboard();
            refreshOnClickEvents();
        })
    }
)

// for webserver ??
function processCommand(cmd, data) {
    post("POST", "/command", {"cmd": cmd, "data": data}).then(() => {
        getData().then(() => {
            //checkWin();
            setScalarCol();
            updateGameboard();
            refreshOnClickEvents();
        })
    })
}

/*idee yannick*/
// pop up message here ?
function newBoard(num) {
    processCommand("newGrid", num)
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




//
// let size = 9
// // zahl zwischen 0 & size^2 - 1
//
// function toScalar(fieldrow, field) {
//     return fieldrow*size + field;
// }
//
// // stimmt
// function row(scalar) {
//     return Math.floor(scalar / size);
// }
//
// // stimmt
// function col(scalar) {
//     return scalar % size;
// }
//
// function cell(fieldrowIndex, cellIndex) {
//     return row(toScalar(fieldrowIndex,cellIndex)), col(toScalar(fieldrowIndex,cellIndex))
// }

let data = {}

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
            .then(() => {
                audio.pause()
                $('#testAudio').get(0).play()
                processCommand("reset", "")
            });
    }
}


let size = 8
let gameboard = new Gameboard(size)

// document.getElementById("scalar{i}").bgcolor="{color}";
// function mit % um jedes zweite feld als rot oder als schwarz zu haben
function setScalarCol() {
    for (let scalar=0; scalar < data.gameBoard.size*data.gameBoard.size; scalar++) {
        if (scalar % 2 === 0) {
            // das ist bullshit und geht nicht background-color geht nicht
            document.getElementById("field" + scalar).style.background-color="#000000";
            console.log("in set Scalar")
        } else {
            document.getElementById("scalar" + scalar).bgcol;
        }
    }
}

// {"game":
// {"gameState":
// "WHITE_TURN","gameBoard":
// {"size":8,"fields":
// [{"row":0,"col":0,"field":{"pos":"A1","piece":{"state":"normal","prow":0,"pcol":0,"color":"black"}}},

function updateGameboard() {
    for (let scalar=0; scalar < data.gameBoard.size*data.gameBoard.size; scalar++) {
        let row = data.game.gameboard.fields[scalar].row
        let col = data.game.gameboard.fields[scalar].col
        let fieldID = "scalar" + scalar
        let color = data.game.gameboard.fields[scalar].field.piece.color
        let state = data.game.gameboard.fields[scalar].field.piece.state

        if (state === "normal") {
            //$("#scalar"+scalar).html("o");
            $('#' + fieldID).attr("src", "/assets/images/white.png");
        } else if (state === "queen") {
            //$("#scalar"+scalar).html("q");
            $('#' + fieldID).attr("src", "/assets/images/white_queen.png");

        }
        if (color === "black") {
            $('#' + fieldID).attr("src", "/assets/images/black.png");
        } else if (color === "white") {
            $('#' + fieldID).attr("src", "/assets/images/black_queen.png");
        }
    }
}






