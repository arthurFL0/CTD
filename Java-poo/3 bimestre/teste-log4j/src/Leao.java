import org.apache.log4j.Logger;

public class Leao {

    public static Logger logger = Logger.getLogger(Leao.class);


    private String nome;
    private int idade;
    private boolean eAlpha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean iseAlpha() {
        return eAlpha;
    }

    public void seteAlpha(boolean eAlpha) {
        this.eAlpha = eAlpha;
    }

    public void correr() {
        logger.info("O leão " + nome + " esta correndo");
    }


    public void ehMaiorQue10() throws Exception {
        if (idade > 10 && iseAlpha()) {
            logger.info("O leao" + nome + "é maior de 10 anos e é Alpha");
        } else if (idade < 10 && idade > 0) {
            logger.info("O leão" + nome + "não tem idade para correr");
        } else {
            logger.error("A idade não pode ser negativa");
            throw new Exception();
        }
    }
}
