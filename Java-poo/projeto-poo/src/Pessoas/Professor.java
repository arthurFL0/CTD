package Pessoas;

import Cursos.Curso;
import Informacoes.TiposFormacao;

public class Professor extends PessoaGenerico {
        protected int valor_hora;
        protected TiposFormacao formacao;
        protected Curso curso;


        public void setValor_hora(int valor_hora) {
                this.valor_hora = valor_hora;
        }

        public void setFormacao(TiposFormacao formacao) {
                this.formacao = formacao;
        }

        public int valorAula(int horatotal){
                int precototal = horatotal * valor_hora;
                return precototal;
        }

        public int getValor_hora() {
                return valor_hora;
        }

        public TiposFormacao getFormacao() {
                return formacao;
        }

        public Curso getCurso() {
                return curso;
        }

        public void setCurso(Curso curso) {
                this.curso = curso;
        }
}
