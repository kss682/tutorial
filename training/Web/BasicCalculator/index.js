function calc(elem){
    var number1 = parseInt(document.getElementById("number1").value);
    var number2 = parseInt(document.getElementById("number2").value);
    
    switch(elem.innerHTML){
        case '+' : document.getElementById("answer").value = number1+number2;
                    break;
        case '-' : document.getElementById("answer").value = number1-number2;
                    break;
        case '*' : document.getElementById("answer").value = number1*number2;
                    break;
        case '/' : document.getElementById("answer").value = number1/number2;
    }

}