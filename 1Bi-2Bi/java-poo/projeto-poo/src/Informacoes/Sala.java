package Informacoes;

import Pessoas.*;

import java.util.ArrayList;

public class Sala {
    protected String nome;
    protected Professor professor;
    protected ArrayList<PessoaGenerico> alunoslista = new ArrayList<>();
    protected ArrayList<Integer> matriculalista = new ArrayList<>();
    protected Turnos turno;
    protected ArrayList<Integer> infoarray = new ArrayList<>();


    public Turnos getTurno() {
        return turno;
    }

    public void setTurno(Turnos turno) {
        this.turno = turno;
    }

    public void AdicionarAluno(PessoaGenerico aluno) {
        this.alunoslista.add(aluno);
        AdicionaMatricula();
    }

    protected void AdicionaMatricula() {
            this.matriculalista.add(alunoslista.size());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<PessoaGenerico> getAlunoslista() {
        return this.alunoslista;
    }


    public ArrayList<Integer> getMatriculalista() {
        return this.matriculalista;
    }

    public void acheInfo(String info,String propriedade){
    infoarray.clear();

    info = info.trim();
    propriedade = propriedade.trim();
    propriedade = propriedade.toLowerCase();

    switch(propriedade){
            case "nome":
                for (PessoaGenerico aluno: alunoslista) {
                    if(aluno.getNome() == info){
                        infoarray.add(alunoslista.indexOf(aluno));

                    }
                }
            break;
            case "cpf":
                for (PessoaGenerico aluno: alunoslista) {
                    if(aluno.getCpf() == info){
                         infoarray.add(alunoslista.indexOf(aluno));

                    }
                }
                break;
            case "telefone":
                for (PessoaGenerico aluno: alunoslista) {
                    if(aluno.getTelefone() == info){
                        infoarray.add(alunoslista.indexOf(aluno));

                    }
                }
                break;
            case "cep":
                for (PessoaGenerico aluno: alunoslista) {
                    if(aluno.getEndereco().getCep() == info){
                        infoarray.add(alunoslista.indexOf(aluno));

                    }
                 }
            break;
            case "email":
                for (PessoaGenerico aluno: alunoslista) {
                    if(aluno.getEmail() == info){
                        infoarray.add(alunoslista.indexOf(aluno));

                }
            }
            break;
            case "sexo":
                for (PessoaGenerico aluno: alunoslista) {
                    if(aluno.getSexo() == info){
                        infoarray.add(alunoslista.indexOf(aluno));

                }
            }
            break;
    }

        infoarray.forEach( (el) -> System.out.println("O aluno de indice"+el+"na lista possui a informação"));

    }

}

