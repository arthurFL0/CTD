public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Casimiro", 3);

        func1.vender(2);

        Vendedor afi1 = new Afiliado("Jaime");
        afi1.vender(4);

        func1.addAfiliado(afi1);

        Vendedor estagi1 = new Estagiario("Jebia");
        estagi1.vender(12);

        System.out.println(func1.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());
        System.out.println(estagi1.mostrarCategoria());

    }
}
