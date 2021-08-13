// Arreglos
let arr = [1, 2, 3, 4, 5];
arr.push("a", "b", "c", "d");
arr.push([]);
arr.push(6.5, 7.5);
arr.pop();
arr.splice(6, 1);
arr.splice(5, 1, "nuevo");

function cantApariciones(arr, n) {
    let cant = 0;
    for (let i = 0; i < n.length; i++) {
        if (arr[i] == n) cant++;
    }
    return cant;
}

function posibleMailValido(s) {
    for (let i = 0; i < s.length; i++) {
        if (s[i] == "@" && i != 0 && i != s.length-1) return true;
    }
    return false;
}

function posibleTelefonoValido(s) {
    if (s[0] == "0") s = s.substring(1);
    return s[0] == "1" && s[1] == "1" && s.length == 10;
}


function validarEmail() {
    let email = document.getElementById("email");
    let resultado = document.getElementById("resultado");
    if (posibleMailValido(email.value)) resultado.innerHTML = "si";
    else resultado.innerHTML = "no";
}

function validarTelefono() {
    let telefono = document.getElementById("telefono");
    let resultado = document.getElementById("resultado");
    if (posibleTelefonoValido(telefono.value)) resultado.innerHTML = "si";
    else resultado.innerHTML = "no";
}