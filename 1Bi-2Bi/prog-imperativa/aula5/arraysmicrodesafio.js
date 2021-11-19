let filmes = ["star wars", "clube da luta", "o poderoso chefão", "top gun", "interestelar"];

let novos_filmes = filmes.join(' ')
let novos_filmesM = novos_filmes.toUpperCase()
console.log(novos_filmesM);
// -- Para usar a função toUpperCase eu transformei a array filmes em uma string. --

let cartoons = ["toy story", "Procurando Nemo", "kung-fu panda", "wally", "fortnite"]

cartoons.pop()
// function movendo(){
//     filmes.push(cartoons.join());
//     console.log(filmes);
// }

// movendo()

//-- Assim eu movi todos os elementos de cartoon para a array filmes em uma só vez, porém eles foram transformados em uma única string --

function movendo2(){
    filmes.push("toystory", "Procurando Nemo", "kung-fu panda", "wally",)
    console.log(filmes)
}

movendo2()

//  FIM DA ATIVIDADE ATÉ O NÚMERO 5 (FALTA O 6)
