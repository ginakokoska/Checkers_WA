let size = 9


function toScalar(fieldrow, cell) {
    return fieldrow*size + cell;
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

class Grid {
    constructor(size){
        this.size = size;
        this.cellvalue = [];
        this.cellgiven = [];
        this.cellhighlighted = [];
        this.cellshowCandidates = [];
    }

    fill(json) {
        for (let scalar=0; scalar <this.size*this.size;scalar++) {
            this.cellvalue[scalar]=(json[toScalar(row(scalar),col(scalar))].cell.value);
            this.cellgiven[scalar]=(json[toScalar(row(scalar),col(scalar))].cell.given);
            this.cellhighlighted[scalar]=(json[toScalar(row(scalar),col(scalar))].cell.highlighted);
            this.cellshowCandidates[scalar]=(json[toScalar(row(scalar),col(scalar))].cell.showCandidates);
        }
    }
}

let grid = new Grid(9)

function updateGrid(grid) {
    for (let scalar=0; scalar <grid.size*grid.size;scalar++) {
        if (grid.cellvalue[scalar] != 0) {
            $("#scalar"+scalar).html(grid.cellvalue[scalar]);
        }
        if (grid.cellgiven[scalar] == true) {
            $("#scalar"+scalar).addClass("given");
        }
        if (grid.cellhighlighted[scalar] == true) {
            $("#scalar"+scalar).addClass("highlighted");
        }

    }
}

function showCandidates(scalar) {
    let html =""
    for (let candidateIndex=1; candidateIndex <= size;candidateIndex++) {
        html = html + " <div class='candidatecell' onclick='setCell("+scalar+","+candidateIndex+")'> " +candidateIndex + "</div>"
        if (candidateIndex % blocksize == blocksize) html = html + "<div class='clear'></div>"
    }
    $("#scalar"+scalar).html(html)
}

function setCell(scalar, value) {
    console.log("Setting cell " + scalar + " to " + value);
    grid.cellvalue[scalar] = value;
    $("#scalar"+scalar).html(" "+grid.cellvalue[scalar]);
    setCellOnServer(row(scalar), col(scalar), value)
    $("#scalar"+scalar).off("click");

}

function registerClickListener() {
    for (let scalar=0; scalar <grid.size*grid.size;scalar++) {
        if (grid.cellvalue[scalar] == 0) {
            $("#scalar"+scalar).click(function() {showCandidates(scalar)});
        }
    }
}

function setCellOnServer(row, col, value) {
    $.get("/set/"+row+"/"+col+"/"+value, function(data) {
        console.log("Set cell on Server");
    });
}

function loadJson() {
    $.ajax({
        method: "GET",
        url: "/json",
        dataType: "json",

        success: function (result) {
            grid = new Grid(result.grid.size);
            grid.fill(result.grid.cells);
            updateGrid(grid);
            registerClickListener();
        }
    });
}

$( document ).ready(function() {
    console.log( "Document is ready, filling grid" );
    loadJson();
});
