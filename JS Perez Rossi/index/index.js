let marginTop = 0;
let marginLeft = 0;

let imagen = document.getElementById("imagen");

function moverAbajo() {
    marginTop += 0.5;
    imagen.style.marginTop = marginTop + "cm";
}

function moverArriba() {
    marginTop -= 0.5;
    imagen.style.marginTop = marginTop + "cm";
}

function moverIzquierda() {
    marginLeft -= 0.5;
    imagen.style.marginLeft = marginLeft + "cm";
}

function moverDerecha() {
    marginLeft += 0.5;
    imagen.style.marginLeft = marginLeft + "cm";
}