function getInput() {
    inp = document.getElementById('userInput').value.split(" ");
    if (inp == "") {
        alert("Please enter your move!")
    } else if (inp.split(" ").length != 2) {
        alert("A move should look like this: 'A3 B4'!")
    } else {
        alert("test")
        start = inp.split(" ")[0]
        dest = inp.split(" ")[1]
        window.location.href = "/input/" + start + "/" + dest;
    }
}