var input_nome = document.getElementById("nome-input");
var input_desc = document.getElementById("desc-input");
var input_img = document.getElementById("imagem-input");
var submit_btn = document.getElementById("submit-btn");
var divinsert = document.querySelector(".insertdiv")

var main = document.getElementById("main");
var form = document.querySelector("form");



submit_btn.addEventListener('click', function() {
    if(input_nome.value == "" || input_desc.value == "" || input_img.value == ""){
        alert("Insira informações nos campos")
    }
    else

    var p = document.createElement("p")
    p.appendChild(document.createTextNode(input_nome.value))
    divinsert.appendChild(p)


    var p = document.createElement("p")
    p.appendChild(document.createTextNode(input_desc.value))
    divinsert.appendChild(p)


    var p = document.createElement("p")
    p.appendChild(document.createTextNode(input_img.value))
    divinsert.appendChild(p)
    
});


// OBSERVAÇÃO IMPORTANTE: Antes eu tava tentando com esse código:

// submit_btn.addEventListener('click', function() {

//     form.innerHTML += "<a>"+input_nome.value+"</a>"

// }

// Só que o click só funcionava uma fez, aparentemente o innerHTML e +=  com algumas tags pode
// funcionar incorretamente, meio que resetando o DOM? Então uma solução é em vez de usar o innerHTML
// já no form, usar numa tag "div" como no exemplo do Fernando (e tambem da pra usar o appendChild como eu fiz):

//------------------------------------------------------------
// submit_btn.addEventListener('click', function(event) {
//     event.preventDefault()
//     //alert("Vamo!")

//     document.querySelector("div").innerHTML += "<p>" + input_nome.value + "</p>"
// });

// Fernando --> "Descobri que a manipulação do innerHTML por algum motivo gera erro nas tags forms e main, se você utilizar uma div para isso, funciona normalmente.
// Essas duas tags devem possuir alguma configuração relacionada com o innerHTML.""