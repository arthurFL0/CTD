// Em um arquivo diferente, crie o objeto literal curso que tem como atributos: nome do curso (string), nota de aprovação (number),
// faltas máximas (number) e uma lista de estudantes (um array composto pelos alunos criados no passo 1).

let lista=require("./inicio");


let curso = {
    nome_do_curso:"CTD",
    nota_aprov: 7,
    max_falta: 5,
    list_aluno: [],
    add_aluno: function(){
        this.list_aluno.push(lista)
    }



}