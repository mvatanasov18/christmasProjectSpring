function changeStyle(){
    const title=document.getElementById("title")
    title.style.top=(lastPos-3) + u;
    lastPos+=10
    title.style.visibility="visible";
}