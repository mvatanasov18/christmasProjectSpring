 let waitArray=[6,15];
  function loadTitles(){
      if (visCount === 6) {
          const h=document.getElementById(visCount.toString());
          setTimeout(() => {
              h.innerHTML="<h1 style='position: absolute;top:" + (lastPos - 10) + u + "'>title 1</h1>" + h.innerHTML }, 1000);
            lastPos+=10;
      }
  }
