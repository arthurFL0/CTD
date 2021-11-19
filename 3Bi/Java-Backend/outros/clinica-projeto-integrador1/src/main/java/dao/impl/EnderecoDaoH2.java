package dao.impl;

import configuration.ConfigurationJDBC;
import dao.IDao;
import model.Endereco;
import model.Paciente;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EnderecoDaoH2 implements IDao <Endereco>{

    private ConfigurationJDBC configurationJDBC;

    public EnderecoDaoH2(ConfigurationJDBC configurationJDBC) {
        this.configurationJDBC = configurationJDBC;
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("INSERT INTO ENDERECO (RUA, NUMERO, CIDADE, ESTADO) VALUES ('%s','%s','%s','%s')",
                endereco.getRua(),endereco.getNumero(),endereco.getCidade(),endereco.getEstado());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if(rs.next()){
                endereco.setId(rs.getInt("ID"));
                statement.close();
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return endereco;
    }

    @Override
    public Optional<Endereco> buscar(Integer id) {
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("SELECT ID, RUA, NUMERO, CIDADE, ESTADO FROM ENDERECO WHERE ID = '%s'", id);
        Endereco endereco = null;

        try{
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                endereco = criarObjetoEndereco(rs);
            }
            statement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return endereco != null ? Optional.of(endereco) :Optional.empty();
    }

    private Endereco criarObjetoEndereco(ResultSet rs) throws SQLException {
        Integer id = rs.getInt("ID");
        String rua = rs.getString("RUA");
        String numero = rs.getString("NUMERO");
        String cidade = rs.getString("CIDADE");
        String estado = rs.getString("ESTADO");
        return new Endereco(id, rua, numero, cidade, estado);
    }

    @Override
    public void excluir(Integer id) {
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = String.format("DELETE FROM ENDERECO WHERE ID = '%s'", id);
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List buscarTodos() {
        Connection connection = configurationJDBC.conectarComBancoDeDados();
        Statement statement = null;
        String query = "SELECT * FROM ENDERECO";
        List<Endereco> enderecos = new ArrayList<>();

        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                enderecos.add(criarObjetoEndereco(rs));
            }
            statement.close();
            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

        return enderecos;
    }
}
