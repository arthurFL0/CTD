// 1) Crie um objeto aluno que tenha como atributos: nome (string), quantidade de faltas (number) e notas (array de números).
// Crie um construtor para ele e importe-o como o módulo aluno.


 function aluno(nome,quantiF,notas){
    this.nome=nome
    this.faltas=quantiF
    this.notas=notas
    this.media= function ()
    {

        let mediatotal = this.notas.reduce(function(acumulador,elemento) {
             return acumulador + elemento    } )

        return (mediatotal/this.notas.length).toFixed(2)

    }
    this.falta = function (){
      return this.faltas= this.faltas + 1
    }

}

let pedro= new aluno("Pedro",5,[8,7,8,7])
let fausto= new aluno("Fausto",4,[5,6,3,5])
let omar=new aluno("Omar",4,[3,6,8,9])

let lista=[pedro,fausto,omar]

module.exports= lista;




