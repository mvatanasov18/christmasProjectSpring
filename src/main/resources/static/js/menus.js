let visCount = 0;
let quantity = 3;
let i = 0;
let u='vmax'
let listImg ;
let listData;
let sizeN=25;
let lastPos=0;
let isSmallDisplay=true;
function loadImg(img) {
    $(img).animate({
        left: '55%',
        top: lastPos + u,
        queue: false
    }, 1000).hide().fadeIn({queue: false}, 2500);

    lastPos+=sizeN;

}

function changeDisplay(){
    let labels=document.getElementsByTagName("label");
    for (let label of labels) {
        label.style.removeProperty("display")
        if(isSmallDisplay){
            label.style.display="inline-block";
        }else{
            label.style.display="inline";
        }

    }
}
function loadData(data) {

    $(data).animate({
        right: '45%',
        top: lastPos + u,
        queue: false
    }, 1000).hide().fadeIn({queue: false}, 3500);
    lastPos+=sizeN;
    changeDisplay()
    visCount++;
}

function hideElements(list, start, end) {
    for (let j = start; j <= end; j++) {
        $(list[j]).hide();

    }
}

function moveElementToLastPos(element){
    $(element).show()
    $(element).animate({top:(lastPos-sizeN*3)+u},10);
    $(element).hide()
}


function loadMeals() {
    hideElements(listImg, quantity, listImg.length);
    hideElements(listData, quantity, listData.length);
    lastPos=sizeN
    for (let j = 0; j <= quantity; j++) {
        loadImg(listImg[j]);
    }
    lastPos=sizeN;
    for (let j = 0; j <= quantity; j++) {

        loadData(listData[j]);
    }

}

function WidthChange(mq) {
    if (mq.matches) {
        isSmallDisplay=true;
        u='vmax';
        sizeN=30
        loadMeals();


    } else {
        isSmallDisplay=false;
        u='vmin';
        sizeN=29
        loadMeals();

    }
}


$(document).ready(function () {

    lastPos=sizeN
    listImg= document.querySelectorAll("#img-list");
    listData= document.querySelectorAll("#data-list");
    if (matchMedia) {
        let mq = window.matchMedia("(max-width: 600px)");
        mq.addListener(WidthChange);
        WidthChange(mq);
    }
});
let lastPosition = 0;
let sumDown = 0;
let lastAdd=0;
window.addEventListener('scroll', () => {
    let element = document.querySelector("#data-list");
    let pos = document.body.getBoundingClientRect().top;
    if (pos < lastPosition) {
        lastAdd=lastPosition - pos;
        sumDown += lastAdd;
        if ($(element).offset().top * 5 / 6 <= sumDown) {
            sumDown = 0;

            if(visCount<=listImg.length){

                moveElementToLastPos(listImg[visCount]);
                moveElementToLastPos(listData[visCount]);

                loadImg(listImg[visCount]);
                lastPos-=sizeN
                loadData(listData[visCount]);
                if(visCount===listImg.length){
                    let submitBtn= document.getElementById("button");
                    submitBtn.innerHTML+=
                        "<button type=\"submit\" class=\"btn btn-primary\">Submit</button>";
                    submitBtn.style.position='absolute';
                    submitBtn.style.top=(lastPos)+u;
                    submitBtn.style.right='63%';
                }
            }

        }
    } else {
        sumDown=0;
        sumDown-=-Math.abs(lastAdd);

    }
    lastPosition = document.body.getBoundingClientRect().top;
});