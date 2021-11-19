public class Sistema {
    public static void main(String[] args) {
        Floresta floresta = new Floresta();
        ArvoreFactory fabrica = new ArvoreFactory();

        do {

            floresta.adicionarArvore(fabrica.verificador("ornamental"));
            floresta.adicionarArvore(fabrica.verificador("frutifera"));



        }
        while(floresta.getFloresta().size() != 100000);

        System.out.println(floresta.getFloresta().size());
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024) + "MB");
        System.out.println("Memória livre: " + (runtime.freeMemory()) / (1024 * 1024) + "MB");

    }

}
