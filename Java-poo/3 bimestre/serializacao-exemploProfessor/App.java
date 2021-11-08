import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro c1 = new Cachorro();
        c1.setNome("Pitoco");
        c1.setIdade(3);

        Cachorro c2 = new Cachorro();
        c2.setNome("Amora");
        c2.setIdade(2);

        Cachorro c3 = new Cachorro();
        c3.setNome("Alfred");
        c3.setIdade(1);

        cachorros.add(c1);
        cachorros.add(c2);
        cachorros.add(c3);

        // Aqui salvamos em um arquivo
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream dos = new ObjectOutputStream(fo);
            dos.writeObject(cachorros);
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Recuperação do arquivo serializado
        List<Cachorro> cachorros2 = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            cachorros2 = (ArrayList) ois.readObject(); // Casting
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Imprimir
        for(Cachorro c : cachorros2)
            System.out.println(
                   c.getNome() +
                   " - " +
                   c.getIdade()
            );

    }

}
