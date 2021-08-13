let e;
window.addEventListener("scroll", function(e) {
    e= window.scrollY;
    console.log(e);
    if(e=> 100 ){
        document.getElementById("trabajos").style.backgroundImage="linear-gradient(90deg, rgb(0, 36, 212), rgb(218, 135, 125))"
    }
    else if(e => 600){
        document.getElementById("trabajo").style.backgroundImage="linear-gradient(45deg, rgb(136, 136, 245), rgb(248, 135, 135))"
    }
});