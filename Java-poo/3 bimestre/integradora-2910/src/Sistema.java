import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class Sistema {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS USERS; CREATE TABLE USERS "
            + "("
            + "ID INT PRIMARY KEY,"
            + "NOME VARCHAR(255) NOT NULL,"
            + "SEXO VARCHAR(255) NOT NULL,"
            + "EMAIL VARCHAR(255) NOT NULL"
            + ");";


    private static final String updateSql = "UPDATE USERS SET NOME = 'ARTHUR' WHERE ID = 2; ";
    private static final String deleteSql = "DELETE FROM USERS WHERE ID = 3;";
    private static final String deleteSql2 = "DELETE FROM USERS WHERE EMAIL = 'fabiogmail.com'; ";

    private static String queryInsert(int id, String nome, String sexo, String email){
        return "INSERT INTO USERS (ID,NOME,SEXO,EMAIL) VALUES ("+id+","+nome+","+sexo+","+email+")";
    }


    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }



    public static void main(String[] args) throws Exception{
        Logger logger = Logger.getLogger(Sistema.class);
        Connection con = null;

        try {
             con = getConnection();
        }catch(Exception e) {
            logger.error("Nao foi possivel se conectar");
        }

        try{
            Statement statement = con.createStatement();
            statement.execute(sqlCreateTable);
            statement.execute(queryInsert(1,"'Carla'","'Feminino'","'carlagmail.com'"));
            statement.execute(queryInsert(2, "'Fabio'", "'Masculino'", "'fabiogmail.com'"));
            statement.execute(queryInsert(3,"'Carlos'","'Masculino'","'carlosgmail.com'"));
            statement.execute(queryInsert(3,"'Olivia'","'Feminino'","'oliviagmail.com'"));

        }catch(SQLIntegrityConstraintViolationException e){
            logger.error("Erro na hora da execução da query",e);
            e.printStackTrace();
        }

        try{
            Statement statement = con.createStatement();
            statement.execute(updateSql);
            logger.debug("O id 2 teve a sua coluna 'nome' alterada para de 'Fabio' para 'Arthur'");

        }catch(SQLIntegrityConstraintViolationException e){

        }

        try{
            Statement statement = con.createStatement();
            statement.execute(deleteSql);
            logger.info("O user de id 3 foi deletado");

        }catch(SQLIntegrityConstraintViolationException e){

        }

        try{
            Statement statement = con.createStatement();
            statement.execute(deleteSql2);
            logger.info("O user de id 2 foi deletado");

        }catch(SQLIntegrityConstraintViolationException e){

        }




    }
}
