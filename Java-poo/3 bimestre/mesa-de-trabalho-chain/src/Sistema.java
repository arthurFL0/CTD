public class Sistema {
    public static void main(String[] args) {
        CheckQuality checko = new CheckQuality();
        Produto produto1 = new Produto("Fantasia do shrek para RPG",500,538,"Saudavel");

        checko.verificador(produto1);


    }
}
