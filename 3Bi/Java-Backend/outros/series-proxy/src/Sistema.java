public class Sistema {
    public static void main(String[] args) {
        SerieProxy proxy = new SerieProxy();

        try{
            System.out.println(proxy.getSerie("The Office"));
        }
        catch(SerieNaoHabilitadaException ex){
            System.err.println(ex);
        }
        try{
            System.out.println(proxy.getSerie("Breaking Bad"));
        }
        catch(SerieNaoHabilitadaException ex){
            System.err.println(ex);
        }
        try{
            System.out.println(proxy.getSerie("The Boys"));
        }
        catch(SerieNaoHabilitadaException ex){
            System.err.println(ex);
        }
        try{
            System.out.println(proxy.getSerie("Band Of Brothers"));
        }
        catch(SerieNaoHabilitadaException ex){
            System.err.println(ex);
        }
        try{
            System.out.println(proxy.getSerie("Invincible"));
        }
        catch(SerieNaoHabilitadaException ex){
            System.err.println(ex);
        }
        try{
            System.out.println(proxy.getSerie("Bob Esponja"));
        }
        catch(SerieNaoHabilitadaException ex){
            System.err.println(ex);
        }


    }
}
