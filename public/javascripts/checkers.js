let size = 9


// zahl zwischen 0 & size^2 - 1
function toScalar(fieldrow, field) {
    return fieldrow*size + field;
}

// stimmt
function row(scalar) {
    return Math.floor(scalar / size);
}

// stimmt
function col(scalar) {
    return scalar % size;
}

function cell(fieldrowIndex, cellIndex) {
    return row(toScalar(fieldrowIndex,cellIndex)), col(toScalar(fieldrowIndex,cellIndex))
}

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


class Gameboard {
    constructor(size){
        this.size = size;
        this.state = [];
        this.color = [];
        this.prow = [];
        this.pcol = [];
    }

    fill(json) {
        for (let scalar=0; scalar <this.size*this.size;scalar++) {
            this.state[scalar]=(json[toScalar(row(scalar),col(scalar))].field.piece.state);
            this.color[scalar]=(json[toScalar(row(scalar),col(scalar))].field.piece.color);
            this.prow[scalar]=(json[toScalar(row(scalar),col(scalar))].field.piece.prow);
            this.pcol[scalar]=(json[toScalar(row(scalar),col(scalar))].field.piece.pcol);
        }
    }
}

let gameboard = new Gameboard(size)

function updateGameboard(gameboard) {
    for (let scalar=0; scalar <gameboard.size*gameboard.size; scalar++) {
        if (gameboard.state[scalar] == "normal" {
            //$("#scalar"+scalar).html("o");
            $("#scalar"+scalar).attr("src", "/assets/images/game/white.png");
        } else if (gameboard.state[scalar] == "queen" {
            //$("#scalar"+scalar).html("q");
            $("#scalar"+scalar).attr("src", "/assets/images/game/white_queen.png");

        }

        if (gameboard.field.piece.color[scalar] == "black") {
            $("#scalar"+scalar).attr("src", "/assets/images/game/black.png");
        } else if (gameboard.field.piece.color[scalar] == "white" {
            $("#scalar"+scalar).attr("src", "/assets/images/game/black_queen.png");
        }
    }
}

// state = o oder q
function setField(scalar, state) {
    console.log("Setting cell " + scalar + " to " + state);
    gameboard.state[scalar] = state;
    $("#scalar"+scalar).html(" "+gameboard.state[scalar]);
    setFieldOnServer(row(scalar), col(scalar), state);
    $("#scalar"+scalar).off("click");

}



function registerClickListener() {
    for (let scalar=0; scalar < gameboard.size*gameboard.size;scalar++) {
        if (gameboard.state[scalar] == 0) {
            $("#fieldrow"+scalar).click(function() {showCandidates(scalar)});
        }
    }
}

function setFieldOnServer(row, col, state) {
    $.get("/set/"+row+"/"+col+"/"+state, function(data) {
        console.log("Set field on Server");
    });
}

function loadJson() {
    $.ajax({
        method: "GET",
        url: "/json",
        dataType: "json",

        success: function (result) {
            gameboard = new Gameboard(result.gameboard.size);
            gameboard.fill(result.gameboard.fields);
            updateGameboard(gameboard);
            registerClickListener();
        }
    });
}

$( document ).ready(function() {
    console.log( "Document is ready, filling gameboard" );
    loadJson();
});
