package dao.impl;

import configuration.ConfigurationJDBC;
import dao.IDao;
import model.Dentista;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DentistaDaoH2 implements IDao<Dentista> {
    private ConfigurationJDBC configurationJDBC;
    private int matriculaContador = 0;
    final static Logger log = Logger.getLogger(DentistaDaoH2.class);

    public DentistaDaoH2(ConfigurationJDBC configurationJDBC) {
        this.configurationJDBC = configurationJDBC;
    }

    @Override
    public Dentista salvar(Dentista dentista) {
        log.debug("Registrando novo dentista: " + dentista.toString());
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO DENTISTA (NUMERO_MATRICULA, NOME, SOBRENOME) VALUES ('%s','%s','%s')",
                ++matriculaContador,dentista.getNome(),dentista.getSobrenome());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if(rs.next()){
                dentista.setId(rs.getInt("ID"));
                statement.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return dentista;
    }

    private Dentista criarObjetoDentista(ResultSet rs) throws SQLException {

        Integer idDentista = rs.getInt("ID");
        int matriculaNumero = rs.getInt("NUMERO_MATRICULA");
        String nome = rs.getString("NOME");
        String sobrenome = rs.getString("SOBRENOME");

        return new Dentista(idDentista,matriculaNumero,nome,sobrenome);
    }

    @Override
    public Optional<Dentista> buscar(Integer id) {
        log.debug("Buscando dentista com id: "+id);
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("SELECT ID, NOME, SOBRENOME FROM DENTISTA" +
                "WHERE ID = '%s'", id);
        Dentista dentista = null;

        try{
            statement = connection.createStatement();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()){
                dentista = criarObjetoDentista(rs);
            }
            statement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return dentista != null ? Optional.of(dentista) : Optional.empty();
    }

    @Override
    public void excluir(Integer id) {
        log.debug("Excluindo paciente com id: "+ id);
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("DELETE FROM DENTISTA WHERE ID = '%s'", id);
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Dentista> buscarTodos() {
        log.debug("Buscando todos os dentistas");
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = "SELECT * FROM DENTISTA";
        List<Dentista> dentistas = new ArrayList<>();

        try{
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                dentistas.add(criarObjetoDentista(rs));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dentistas;
    }
}
