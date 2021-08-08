function agregarFila(){
    let tabla= document.getElementById("tabla");
    let tr = document.createElement("tr");
    let td1 = document.createElement("td1");
    let inputNombre = document.createElement("input");
    inputNombre.setAttribute("type","text");
    td1.appendChild(inputNombre)
    tr.appendChild(td1);
    tabla.appendChild(tr);
}