// Crie um loop utilizando for que se repita 5 vezes. Dentro de cada repetição se deve mostrar no console a mensagem “Olá mundo”.

for(let i=1;i<=5;i++){
    console.log(i,"Olá mundo")
}

// Crie um loop for de 1 a 10, em que exiba no console apenas o valor das repetições de números ímpares.
// Dica: A ideia é que nas repetições ímpares de 0 ao 10 (1,3,5,7,9) sejam mostrados os números das repetições no console.

for(let i=1; i<=10; i=i+2){

    console.log(i)
}

// Crie uma tabuada utilizando o for. Dica: Para essa tarefa você irá precisar utilizar dois loops (for).

var num = 8;

for(var i=1; i<=10; i++){
    console.log(num+"x"+i+"="+(num*i));
}