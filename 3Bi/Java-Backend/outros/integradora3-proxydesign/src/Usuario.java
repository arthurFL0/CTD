public class Usuario {
    public static void main(String[] args){
        GradeFilmesProxy proxy = new GradeFilmesProxy(new GradeFilmes());
        proxy.setIP(new IP(98,255,10,15));


        try{
            System.out.println(proxy.getFilme("Titanic").getLink());
        }
        catch(FilmeNaoHabilitadoException e){
            System.err.println(e);
        }

        try{
            System.out.println(proxy.getFilme("Tropa de Elite").getLink());
        }
        catch(FilmeNaoHabilitadoException e){
            System.err.println(e);

        }

    }

}
