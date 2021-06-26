//Exercício 1
let imc

function calcularIndice(peso, altura) {
    altura = altura / 100;
    return (peso / (altura ** 2)).toFixed(2);

    //Exercício 2
}
console.log('Imc= ' + calcularIndice(80, 200));

let soma = function (n1, n2) {
    return (n1 + n2).toFixed(2)
}
let sub = function (n1, n2) {
    return (n1 - n2).toFixed(2)
}
let mult = function (n1, n2) {
    return (n1 * n2).toFixed(2)
}
let div = function (n1, n2) {
    return (n1 / n2).toFixed(2)
}
console.log(div(320, 97))

