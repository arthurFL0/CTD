package serviceTest;

import configuration.ConfigurationJDBC;
import dao.impl.DentistaDaoH2;
import model.Dentista;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import service.DentistaService;

import java.util.List;

public class DentistaServiceTest {
    private static DentistaService dentistaService = new DentistaService(new DentistaDaoH2(new ConfigurationJDBC()));

    @BeforeClass
    public static void prepararTeste(){
        Dentista dentista1 = new Dentista("Pascal","Torreno");
        Dentista dentista2 = new Dentista("Felipe","Moureira");
        dentistaService.salvar(dentista1);
        dentistaService.salvar(dentista2);
    }

    @Test
    public void buscandoTodosDentistas(){
        List<Dentista> dentistas = dentistaService.buscarTodos();
        Assert.assertTrue(!dentistas.isEmpty());
        System.out.println(dentistas);
    }
}
