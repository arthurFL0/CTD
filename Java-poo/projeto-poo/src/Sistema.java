import Cursos.*;
import Informacoes.*;
import Pessoas.*;

public class Sistema {

    public static void main(String[] args){
        CursoAdmin cursoadmin = CursoAdmin.getINSTANCE();
        cursoadmin.setValormensal(850);
        CursoIngles cursoingles = CursoIngles.getINSTANCE();
        cursoingles.setValormensal(700);
        CursoInformatica cursoinfo = CursoInformatica.getINSTANCE();
        cursoinfo.setValormensal(800);

        PessoaGenerico aluno1 = new PessoaGenerico();
        aluno1.setNome("Jaime");
        aluno1.setSexo("M");

        Professor professor1 = new Professor();
        professor1.setNome("Eduardo");
        professor1.setCurso(cursoadmin);

        Professor professor2 = new Professor();
        professor2.setNome("Gleyson");
        professor2.setCurso(cursoadmin);


        PessoaGenerico aluno2 = new PessoaGenerico();
        aluno2.setNome("Fernanda");
        aluno2.setSexo("F");

        Endereco endereco1 = new Endereco();
        endereco1.setCidade("Campinas");
        endereco1.setBairro("Vargem Baixa");
        aluno1.setEndereco(endereco1);

        Sala sala1 = new Sala();
        sala1.setTurno(Turnos.M);
        sala1.AdicionarAluno(aluno1);
        sala1.AdicionarAluno(aluno2);
        System.out.println(sala1.getAlunoslista());
        System.out.println(sala1.getMatriculalista());
        System.out.println(sala1.getTurno().getValor1());



    }
}
