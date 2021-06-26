//Exercício 3

let nomeJogador = 'Gabi', golsJogador = 0, precoDolar = 0, novoPreco=0

function fazerGol() {
golsJogador++
precoDolar+=10000
console.log('Goooooool!')
}

fazerGol()
fazerGol()
console.log('O jogador '+nomeJogador+' fez '+golsJogador+' gols. O seu valor e de '+ precoDolar+ '.')

//Exercicio 4
function Hatrick(){
fazerGol()
fazerGol()
fazerGol()
precoDolar+=(precoDolar*10/100)
}

Hatrick()

console.log('O jogador '+nomeJogador+' fez '+golsJogador+' gols. O seu valor e de '+ precoDolar+ '.')