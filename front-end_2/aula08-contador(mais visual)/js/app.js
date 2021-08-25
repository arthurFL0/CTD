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

var botaoCancelar = document.createElement("button");
var botaoTextoCancelar = document.createTextNode("Cancelar");
botaoCancelar.setAttribute("type", "reset");
botaoCancelar.appendChild(botaoTextoCancelar);
form.appendChild(botaoCancelar);

botaoEnviar.addEventListener('click', function (event) {
    console.log("Teste")
    event.preventDefault();
});

window.onload = function () {
    alert("ATENÇÂO SEU COMPUTADOR POSSUI 1000000 virus")
}



titulo.addEventListener('mouseover', function () {
    // titulo.style.color("blue")
    titulo.style.color = "blue";
    
});

titulo.addEventListener('mouseleave', function () {
    // titulo.style.color("blue")
    titulo.style.color = "black";
    
});

// PARTE DO CONTADOR

// A variavel "verifier" começa com o valor true para a primeira vez que uma tecla é apertada. Dentro desse if é criado
// as tags p tanto do contador quanto das teclas.

// Logo no inicio do if é adicionado +1 a variavel contador, por meio do "contador++", que inicialmente estava com 0, a variavel
// verifier muda de true para false, para o segundo if ser acionado na proxima vez que uma tecla for apertada e a função ativada.

// O segundo if tambem possui um contador++, ja que é preciso continuar contando a quantidade de teclas. Nele as tags ja criadas
// sao somente "atualizadas". Repare que na linha 98 eu uso o sinal "=" e na linha 99 eu uso o sinal "+=", pois na primeira, no contador,
// o conteudo da tag é completamente alterado para o novo numero atualizado da variavel contador. Já
// na tag das teclas, o conteudo ja existente (nesse caso as teclas que foram inseridas antes)
// é juntado com a nova tecla apertada.

let verifier = true
let contador = 0

email.onkeydown = function(event) {
    if(verifier == true){
        contador++

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
        document.querySelector(".counter").innerText = contador
        document.querySelector(".teste").innerText +=(event.key);
    }
}


