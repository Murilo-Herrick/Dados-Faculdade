let Xganhou = 0;
let Oganhou = 0;
let gameOver = false;

function bt1() {
    if (document.getElementById("1").innerHTML == " ") {
        let esc = document.getElementById("jogador");
        if (esc.innerHTML == "X") {
            document.getElementById("1").innerHTML = "X";
            document.getElementById("jogador").innerHTML = "O";
            setTimeout(vbt1x, 300);
        }
        else if (esc.innerHTML == "O") {
            document.getElementById("1").innerHTML = "O";
            document.getElementById("jogador").innerHTML = "X";
            setTimeout(vbt1o, 300); 
        }

    }
}

function bt2() {
    if (document.getElementById("2").innerHTML == " ") {
        let esc = document.getElementById("jogador");
        if (esc.innerHTML == "X") {
            document.getElementById("2").innerHTML = "X";
            document.getElementById("jogador").innerHTML = "O";
            setTimeout(vbt2x, 300);
        }
        else {
            document.getElementById("2").innerHTML = "O";
            document.getElementById("jogador").innerHTML = "X";
            setTimeout(vbt2o, 300);
        }
    }

}
function bt3() {
    if (document.getElementById("3").innerHTML == " ") {
        let esc = document.getElementById("jogador");
        if (esc.innerHTML == "X") {
            document.getElementById("3").innerHTML = "X";
            document.getElementById("jogador").innerHTML = "O";
            setTimeout(vbt3x, 300);
        }
        else {
            document.getElementById("3").innerHTML = "O";
            document.getElementById("jogador").innerHTML = "X";
            setTimeout(vbt3o, 300);
        }
    }
}
/* ******  Botões 4 5 e 6 ******************************************/
function bt4() {
    if (document.getElementById("4").innerHTML == " ") {
        let esc = document.getElementById("jogador");
        if (esc.innerHTML == "X") {
            document.getElementById("4").innerHTML = "X";
            document.getElementById("jogador").innerHTML = "O";
            setTimeout(vbt4x, 300);
        }
        else if (esc.innerHTML == "O") {
            document.getElementById("4").innerHTML = "O";
            document.getElementById("jogador").innerHTML = "X";
            setTimeout(vbt4o, 300);
        }
    }
}
function bt5() {
    if (document.getElementById("5").innerHTML == " ") {
        let esc = document.getElementById("jogador");
        if (esc.innerHTML == "X") {
            document.getElementById("5").innerHTML = "X";
            document.getElementById("jogador").innerHTML = "O";
            setTimeout(vbt5x, 300);
        }
        else {
            document.getElementById("5").innerHTML = "O";
            document.getElementById("jogador").innerHTML = "X";
            setTimeout(vbt5o, 300);
        }
    }
}
function bt6() {
    if (document.getElementById("6").innerHTML == " ") {
        let esc = document.getElementById("jogador");
        if (esc.innerHTML == "X") {
            document.getElementById("6").innerHTML = "X";
            document.getElementById("jogador").innerHTML = "O";
            setTimeout(vbt6x, 300);
        }
        else {
            document.getElementById("6").innerHTML = "O";
            document.getElementById("jogador").innerHTML = "X";
            setTimeout(vbt6o, 300);
        }
    }
}

/* ******  Botões 7 8 e 9 ******************************************/
function bt7() {
    if (document.getElementById("7").innerHTML == " ") {
        let esc = document.getElementById("jogador");
        if (esc.innerHTML == "X") {
            document.getElementById("7").innerHTML = "X";
            document.getElementById("jogador").innerHTML = "O";
            setTimeout(vbt7x, 300);
        }
        else if (esc.innerHTML == "O") {
            document.getElementById("7").innerHTML = "O";
            document.getElementById("jogador").innerHTML = "X";
            setTimeout(vbt7o, 300);
        }
    }
}
function bt8() {
    if (document.getElementById("8").innerHTML == " ") {
        let esc = document.getElementById("jogador");
        if (esc.innerHTML == "X") {
            document.getElementById("8").innerHTML = "X";
            document.getElementById("jogador").innerHTML = "O";
            setTimeout(vbt8x, 300);
        }
        else {
            document.getElementById("8").innerHTML = "O";
            document.getElementById("jogador").innerHTML = "X";
            setTimeout(vbt8o, 300);
        }
    }
}
function bt9() {
    if (document.getElementById("9").innerHTML == " ") {
        let esc = document.getElementById("jogador");
        if (esc.innerHTML == "X") {
            document.getElementById("9").innerHTML = "X";
            document.getElementById("jogador").innerHTML = "O";
            setTimeout(vbt9x, 300);
        }
        else {
            document.getElementById("9").innerHTML = "O";
            document.getElementById("jogador").innerHTML = "X";
            setTimeout(vbt9o, 300);
        }
    }
}

/* Funções para verificação de ganhador na posição 1 **************************  */
function vbt1x() {
    if (document.getElementById("1").innerHTML == "X" && document.getElementById("2").innerHTML == "X" &&
        document.getElementById("3").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
    else if (document.getElementById("1").innerHTML == "X" && document.getElementById("5").innerHTML == "X" &&
        document.getElementById("9").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
    else if (document.getElementById("1").innerHTML == "X" && document.getElementById("4").innerHTML == "X" &&
        document.getElementById("7").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
}

function vbt1o() {
    if (document.getElementById("1").innerHTML == "O" && document.getElementById("2").innerHTML == "O" &&
        document.getElementById("3").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
    else if (document.getElementById("1").innerHTML == "O" && document.getElementById("5").innerHTML == "O" &&
        document.getElementById("9").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
    else if (document.getElementById("1").innerHTML == "O" && document.getElementById("4").innerHTML == "O" &&
        document.getElementById("7").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
}

/* Funções para verificação de ganhador na posição 2 **************************  */
function vbt2x() {
    if (document.getElementById("1").innerHTML == "X" && document.getElementById("2").innerHTML == "X" &&
        document.getElementById("3").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
    else if (document.getElementById("2").innerHTML == "X" && document.getElementById("5").innerHTML == "X" &&
        document.getElementById("8").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
}

function vbt2o() {
    if (document.getElementById("1").innerHTML == "O" && document.getElementById("2").innerHTML == "O" &&
        document.getElementById("3").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
    else if (document.getElementById("2").innerHTML == "O" && document.getElementById("5").innerHTML == "O" &&
        document.getElementById("8").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
}

/* Funções para verificação de ganhador na posição 3 **************************  */
function vbt3x() {
    if (document.getElementById("1").innerHTML == "X" && document.getElementById("2").innerHTML == "X" &&
        document.getElementById("3").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
    else if (document.getElementById("3").innerHTML == "X" && document.getElementById("6").innerHTML == "X" &&
        document.getElementById("9").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
    else if (document.getElementById("3").innerHTML == "X" && document.getElementById("5").innerHTML == "X" &&
        document.getElementById("7").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
}

function vbt3o() {
    if (document.getElementById("1").innerHTML == "O" && document.getElementById("2").innerHTML == "O" &&
        document.getElementById("3").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
    else if (document.getElementById("3").innerHTML == "O" && document.getElementById("6").innerHTML == "O" &&
        document.getElementById("9").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
    else if (document.getElementById("3").innerHTML == "O" && document.getElementById("5").innerHTML == "O" &&
        document.getElementById("7").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
}

/* Funções para verificação de ganhador na posição 4 **************************  */
function vbt4o() {
    if (document.getElementById("1").innerHTML == "O" && document.getElementById("4").innerHTML == "O" &&
        document.getElementById("7").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
    else if (document.getElementById("4").innerHTML == "O" && document.getElementById("5").innerHTML == "O" &&
        document.getElementById("6").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
}

function vbt4x() {
    if (document.getElementById("1").innerHTML == "X" && document.getElementById("4").innerHTML == "X" &&
        document.getElementById("7").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
    else if (document.getElementById("4").innerHTML == "X" && document.getElementById("5").innerHTML == "X" &&
        document.getElementById("6").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
}

/* Funções para verificação de ganhador na posição 5 **************************  */
function vbt5x() {
    if (document.getElementById("4").innerHTML == "X" && document.getElementById("5").innerHTML == "X" &&
        document.getElementById("6").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
    else if (document.getElementById("2").innerHTML == "X" && document.getElementById("5").innerHTML == "X" &&
        document.getElementById("8").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
}

function vbt5o() {
    if (document.getElementById("4").innerHTML == "O" && document.getElementById("5").innerHTML == "O" &&
        document.getElementById("6").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
    else if (document.getElementById("2").innerHTML == "O" && document.getElementById("5").innerHTML == "O" &&
        document.getElementById("8").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
}

/* Funções para verificação de ganhador na posição 6 **************************  */
function vbt6x() {
    if (document.getElementById("3").innerHTML == "X" && document.getElementById("6").innerHTML == "X" &&
        document.getElementById("9").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
    else if (document.getElementById("4").innerHTML == "X" && document.getElementById("5").innerHTML == "X" &&
        document.getElementById("6").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
}

function vbt6o() {
    if (document.getElementById("3").innerHTML == "O" && document.getElementById("6").innerHTML == "O" &&
        document.getElementById("9").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
    else if (document.getElementById("4").innerHTML == "O" && document.getElementById("5").innerHTML == "O" &&
        document.getElementById("6").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
}

/* Funções para verificação de ganhador na posição 7 **************************  */
function vbt7x() {
    if (document.getElementById("1").innerHTML == "X" && document.getElementById("4").innerHTML == "X" &&
        document.getElementById("7").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
    else if (document.getElementById("3").innerHTML == "X" && document.getElementById("5").innerHTML == "X" &&
        document.getElementById("7").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
    else if (document.getElementById("7").innerHTML == "X" && document.getElementById("8").innerHTML == "X" &&
        document.getElementById("9").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
}

function vbt7o() {
    if (document.getElementById("1").innerHTML == "O" && document.getElementById("4").innerHTML == "O" &&
        document.getElementById("7").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
    else if (document.getElementById("3").innerHTML == "O" && document.getElementById("5").innerHTML == "O" &&
        document.getElementById("7").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
    else if (document.getElementById("7").innerHTML == "O" && document.getElementById("8").innerHTML == "O" &&
        document.getElementById("9").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
}

/* Funções para verificação de ganhador na posição 8 **************************  */
function vbt8x() {
    if (document.getElementById("2").innerHTML == "X" && document.getElementById("5").innerHTML == "X" &&
        document.getElementById("8").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
    else if (document.getElementById("7").innerHTML == "X" && document.getElementById("8").innerHTML == "X" &&
        document.getElementById("9").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
}

function vbt8o() {
    if (document.getElementById("2").innerHTML == "O" && document.getElementById("5").innerHTML == "O" &&
        document.getElementById("8").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
    else if (document.getElementById("7").innerHTML == "O" && document.getElementById("8").innerHTML == "O" &&
        document.getElementById("9").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
}

/* Funções para verificação de ganhador na posição 9 **************************  */
function vbt9x() {
    if (document.getElementById("3").innerHTML == "X" && document.getElementById("6").innerHTML == "X" &&
        document.getElementById("9").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
    else if (document.getElementById("1").innerHTML == "X" && document.getElementById("5").innerHTML == "X" &&
        document.getElementById("9").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
    else if (document.getElementById("7").innerHTML == "X" && document.getElementById("8").innerHTML == "X" &&
        document.getElementById("9").innerHTML == "X") {
        window.alert("O Jogador X ganhou");
        gameOver = true;
    }
}

function vbt9o() {
    if (document.getElementById("3").innerHTML == "O" && document.getElementById("6").innerHTML == "O" &&
        document.getElementById("9").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
    else if (document.getElementById("1").innerHTML == "O" && document.getElementById("5").innerHTML == "O" &&
        document.getElementById("9").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
    else if (document.getElementById("7").innerHTML == "O" && document.getElementById("8").innerHTML == "O" &&
        document.getElementById("9").innerHTML == "O") {
        window.alert("O Jogador O ganhou");
        gameOver = true;
    }
}

function reiniciar() {
    document.getElementById("1").innerHTML= " ";
    document.getElementById("2").innerHTML= " ";
    document.getElementById("3").innerHTML= " ";
    document.getElementById("4").innerHTML= " ";
    document.getElementById("5").innerHTML= " ";
    document.getElementById("6").innerHTML= " ";
    document.getElementById("7").innerHTML= " ";
    document.getElementById("8").innerHTML= " ";
    document.getElementById("9").innerHTML= " ";

    document.getElementById("jogador").innerHTML = "X";
    gameOver = false;
}

 