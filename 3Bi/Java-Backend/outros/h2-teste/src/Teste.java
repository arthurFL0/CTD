import java.sql.*;

public class Teste {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS FORMAS; CREATE TABLE FORMAS "
            + "("
            + "ID INT PRIMARY KEY,"
            + "FORMA VARCHAR(255) NOT NULL,"
            + "COR VARCHAR(255) NOT NULL"
            + ")";

    private static final String sqlInsert1 = "INSERT INTO FORMAS (ID,FORMA,COR) VALUES (1, 'Quadrado','Azul')";
    private static final String sqlInsert2 = "INSERT INTO FORMAS (ID,FORMA,COR) VALUES (2, 'Quadrado','Vermelho')";
    private static final String sqlInsert3 = "INSERT INTO FORMAS (ID,FORMA,COR) VALUES (3, 'Quadrado','Amarelo')";
    private static final String sqlInsert4 = "INSERT INTO FORMAS (ID,FORMA,COR) VALUES (4, 'Circulo','Verde')";
    private static final String sqlInsert5 = "INSERT INTO FORMAS (ID,FORMA,COR) VALUES (5, 'Circulo','Azul')";


    private static final String sqlSelect = "SELECT * FROM FORMAS";



    public static void main(String[] args) throws Exception {
      Connection con = null;

      try{
          con = getConnection();
          Statement statement = con.createStatement();
          statement.execute(sqlCreateTable);
          statement.execute(sqlInsert1);
          statement.execute(sqlInsert2);
          statement.execute(sqlInsert3);
          statement.execute(sqlInsert4);
          statement.execute(sqlInsert5);

          showDados(con, sqlSelect);
      }
      catch(Exception e){
          e.printStackTrace();
      } finally {
          if(con == null)
              return;
          con.close();
      }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").getDeclaredConstructor().newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }
    private static void showDados(Connection connection, String sqlQuery) throws Exception{
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        while(rs.next()){
            System.out.println(rs.getInt(1)+ "-"+rs.getString(2)+"-"+rs.getString(3));

        }
    }


}
