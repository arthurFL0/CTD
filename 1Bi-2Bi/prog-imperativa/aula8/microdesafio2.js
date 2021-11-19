// Crie um array numerosPrimos e atribua alguns valores a ele que correspondam ao seu nome. Além disso, crie outro array, desta vez chamado numeros,
// que deve conter os valores do array numerosPrimos adicionados através do spread, juntos com outros números.

// Crie uma função maiorNumero() que receba N parâmetros, e retorne o menor número entre eles, utilizando a função Math.min(). 
// Uma observação importante é que a função Math.min() NÃO deve receber um array como parâmetro, sendo portanto, necessário expandir os valores.

let numerosPrimos = [1,3,7,9,11,13]
let numeros = [...numerosPrimos,16,17,18]

console.log(numeros)

function menorNumero(n1){
    return Math.min(...n1)
}

console.log(menorNumero([2/6,3/4,3/2]))