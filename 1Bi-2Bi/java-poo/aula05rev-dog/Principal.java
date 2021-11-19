public class Principal {


     public static void main(String[] args) {

     Cachorro dog = new Cachorro();

     dog.setAno(2015);
     dog.setMachucado(false);
     dog.setPeso(5.5);
     dog.setDisponibilidade(true);

     System.out.println(dog.poderAdotar()+" "+"Sua idade:"+dog.getIdade());

    }
}
