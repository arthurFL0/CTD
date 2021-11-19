import org.apache.log4j.Logger;

public class Test {

    private static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        Leao leao = new Leao();
        leao.seteAlpha(true);
        leao.setIdade(20);
        leao.setNome("Simba");
        leao.correr();

        try{
            leao.ehMaiorQue10();
        }catch(Exception e){
            logger.error("A idade do leao "+leao.getNome()+" esta incorreta", e);
        }

        Leao leao2 = new Leao();
        leao2.seteAlpha(true);
        leao2.setIdade(-1);
        leao2.setNome("Simba");
        leao2.correr();

        try{
            leao2.ehMaiorQue10();
        }catch(Exception e){
            logger.error("A idade do leao "+leao2.getNome()+" esta incorreta", e);
        }

    }
}
