//Criação do formulário:

var formulario = document.createElement("form");
formulario.setAttribute('class', 'formulario');
document.body.appendChild(formulario);

//Seleção do formulário:

var form = document.querySelector(".formulario");

//Inserção do Título:

var titulo = document.createElement("h1");
var tituloText = document.createTextNode("Login");
titulo.appendChild(tituloText);
form.appendChild(titulo);

//Inserção dos inputs:

var email = document.createElement("input");
email.setAttribute("placeholder", "Email");
email.setAttribute("type", "text");
form.appendChild(email);

var senha = document.createElement("input");
senha.setAttribute("placeholder", "Senha");
senha.setAttribute("type", "password");
form.appendChild(senha);

//Inserção dos botões:

var botaoEnviar = document.createElement("button");
var botaoTextoEnviar = document.createTextNode("Enviar");
botaoEnviar.setAttribute("type", "submit");
botaoEnviar.appendChild(botaoTextoEnviar);
form.appendChild(botaoEnviar);

botaoEnviar.addEventListener("click", function(event){
    event.preventDefault();
})

var botaoCancelar = document.createElement("button");
var botaoTextoCancelar = document.createTextNode("Cancelar");
botaoCancelar.setAttribute("type", "reset");
botaoCancelar.appendChild(botaoTextoCancelar);
form.appendChild(botaoCancelar);

//Manipulação de atributos:

email.setAttribute("disabled", true);

//Remoção do atributo:

email.removeAttribute("placeholder");

//Sugestão de estilização:

formulario.style.display = "flex";
formulario.style.maxWidth = "300px";
formulario.style.margin = "10% auto";
formulario.style.textAlign = "center";
formulario.style.flexDirection = "column";


let verifier = true
let contador = 0

senha.onkeydown = function(event) {
    if(verifier == true){
        contador++
        console.log(contador)

        var contadorp = document.createElement("p")
        contadorp.setAttribute("class", "counter")
        var primeiro_contador = document.createTextNode(contador)
        contadorp.appendChild(primeiro_contador)
        document.body.appendChild(contadorp)

        verifier = false
        var tagp = document.createElement("p")
        tagp.setAttribute("class", "teste")
        var letra = document.createTextNode(event.key)
        tagp.appendChild(letra)
        document.body.appendChild(tagp)
    }
    else if(verifier == false) {
        contador++
        console.log(contador)
        document.querySelector(".counter").innerText = contador
        document.querySelector(".teste").innerText +=(event.key);
    }
}




// senha.onkeydown = function(event) {
//     if(contador == 0){
//     contador++
    

//     var contadorp = document.createElement("p")
//     contadorp.setAttribute("class", "counter")
//     var primeiro_contador = document.createTextNode(contador)
//     contadorp.appendChild(primeiro_contador)
//     document.body.appendChild(contadorp)

//     var tagp = document.createElement("p")
//     tagp.setAttribute("class", "teste")
//     var letra = document.createTextNode(event.key)
//     tagp.appendChild(letra)
//     document.body.appendChild(tagp)
//     }
//     if(contador > 0){
//     contador++
//         document.querySelector(".teste").innerText +=(event.key);
//         document.querySelector(".counter").innerText +=(contador)
//     }
// }
