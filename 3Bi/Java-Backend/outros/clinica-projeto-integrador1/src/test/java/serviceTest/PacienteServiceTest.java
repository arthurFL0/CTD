package serviceTest;


import configuration.ConfigurationJDBC;
import dao.impl.EnderecoDaoH2;
import dao.impl.PacienteDaoH2;
import model.Endereco;
import model.Paciente;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import service.EnderecoService;
import service.PacienteService;

import java.util.Date;
import java.util.List;

public class PacienteServiceTest {

    private static PacienteService pacienteService = new PacienteService(new PacienteDaoH2(new ConfigurationJDBC(),new EnderecoDaoH2(new ConfigurationJDBC())));
    private EnderecoService enderecoService = new EnderecoService(new EnderecoDaoH2(new ConfigurationJDBC()));

    @BeforeClass
    public static void cadastrarPessoas(){
        Endereco endereco = new Endereco("Av. Avenida","34","Ribeirinho","Espirito Santo");
        Paciente paciente = pacienteService.salvar(new Paciente("Cleber","Mendonça","89182308",new Date(),endereco));
        Endereco endereco2 = new Endereco("Av. Amarela","24","Sao Jose","Mato Grosso");
        Paciente paciente2 = pacienteService.salvar(new Paciente("Joao","Filho","901923123",new Date(),endereco2));
    }

    @Test
    public void salvarBuscarTeste(){
        Endereco endereco3 = new Endereco("Alameda Pitocotinho","12","Litropolis","Sao Paulo");
        Paciente paciente3 = pacienteService.salvar(new Paciente("Rita","Almeida","1023911231",new Date(),endereco3));

        Assert.assertNotNull(pacienteService.buscar(paciente3.getId()));
    }

    @Test
    public void excluirTest(){
        pacienteService.excluir(3);
        Assert.assertTrue(pacienteService.buscar(3).isEmpty());
    }

    @Test
    public void buscarTodosTest(){
        List<Paciente> pacientes = pacienteService.buscarTodos();
        Assert.assertTrue(!pacientes.isEmpty());
        System.out.println(pacientes);
    }
}
