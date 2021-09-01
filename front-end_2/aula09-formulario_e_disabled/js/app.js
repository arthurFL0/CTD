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
var div1 = document.createElement("div");
div1.setAttribute("class", "div1");
form.appendChild(div1);


var email = document.createElement("input");
email.setAttribute("placeholder", "Email");
email.setAttribute("type", "text");
email.setAttribute("class", "email");
div1.appendChild(email);

var div2 = document.createElement("div");
div2.setAttribute("class", "div2");
form.appendChild(div2);


var senha = document.createElement("input");
senha.setAttribute("placeholder", "Senha");
senha.setAttribute("id", "senha");
senha.setAttribute("type", "password");
div2.appendChild(senha);

var div3 = document.createElement("div");
div3.setAttribute("class", "div3");
form.appendChild(div3);

var campo = document.createElement("input");
campo.setAttribute("placeholder", "campo");
campo.setAttribute("id", "campo");
campo.setAttribute("type", "text");
div3.appendChild(campo);

//Radio Buttons
let  botaoRadio1 = document.createElement("input");
botaoRadio1.setAttribute("type", "radio");
botaoRadio1.setAttribute("name", "radiobtn");
form.appendChild(botaoRadio1)

let  botaoRadio2 = document.createElement("input");
botaoRadio2.setAttribute("type", "radio");
botaoRadio2.setAttribute("name", "radiobtn");

form.appendChild(botaoRadio2)

//Inserção dos botões:

var botaoEnviar = document.createElement("button");
var botaoTextoEnviar = document.createTextNode("Enviar");
botaoEnviar.setAttribute("type", "submit");
botaoEnviar.appendChild(botaoTextoEnviar);
form.appendChild(botaoEnviar);

var botaoCancelar = document.createElement("button");
var botaoTextoCancelar = document.createTextNode("Cancelar");
botaoCancelar.setAttribute("type", "reset");
botaoCancelar.appendChild(botaoTextoCancelar);
form.appendChild(botaoCancelar);

//Manipulação de atributos:


//Remoção do atributo:

email.removeAttribute("placeholder");

//Sugestão de estilização:

formulario.style.display = "flex";
formulario.style.maxWidth = "300px";
formulario.style.margin = "10% auto";
formulario.style.textAlign = "center";
formulario.style.flexDirection = "column";

//Ativa ao terminar de carregar a página
window.onload = alert("Parabéns! Você é o nosso milionésimo visitante.")

//Verifica se foi clicado e atribui uma função
botaoEnviar.onclick = function() {
    if (document.querySelector("#senha").value == "") {
        alert("O campo senha não pode estar vazio.")
    }
}

//Verifica se foi clicado e atruibui um evento
botaoEnviar.addEventListener('click', function(event) {
    event.preventDefault()
});

//Quando o mouse está sobre o elemento
botaoEnviar.addEventListener('mouseover', function() {
    formulario.style.backgroundColor = "blue";
});

//Quando o mouse sai de sobre o elemento
botaoEnviar.addEventListener('mouseout', function() {
    formulario.style.backgroundColor = "white";
});


// Construa um formulário, usando javascript, com no mínimo três campos de input e esses campos de input terão comportamentos
//  a decorrer de algumas condições. Construa esses inputs de uma forma que quando forem preenchidos com algum conteúdo, 
//  os campos receberão a propriedade “disabled”, mas quando o mouse estiver acima desse campo ele vai perder essa propriedade 
//  possibilitando a modificação do conteúdo pelo usuário. Quando o mouse sair do input e o mesmo tiver preenchido, 
//  ele receberá a propriedade disabled novamente.


// ----------------------


email.onmouseleave = function() {
    if(email.value == ""){
        email.disabled = false;
    }else{
        email.disabled = true;
    }
}

div1.onmouseenter = function(){
    if(email.disabled = true){
        email.disabled = false
    } else{
    }
}
// ----------------------

senha.onmouseleave = function() {
    if(senha.value == ""){
        senha.disabled = false;
    }else{
        senha.disabled = true;
    }
}

div2.onmouseenter = function(){
    if(senha.disabled = true){
        senha.disabled = false
    } else{
    }
}

// ------------------

campo.onmouseleave = function() {
    if(campo.value == ""){
        campo.disabled = false;
    }else{
        campo.disabled = true;
    }
}

div3.onmouseenter = function(){
    if(campo.disabled = true){
        campo.disabled = false
    } else{
    }
}