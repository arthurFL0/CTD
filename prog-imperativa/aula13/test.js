let objeto = {
    cor: "azul",
    valor: 3,
    cores : {estado:"calor",coisa: "água"},
    array : [32,43,23]

}

let jason = JSON.stringify(objeto);

console.log(jason)

let objector = JSON.parse(jason)

console.log(objector)