public class Serie implements ISerie{

    @Override
    public String getSerie(String nome) {
        String url ="www."+nome.replace(" ","")+".com";
        return url ;
    }
}
