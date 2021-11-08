public class RealDownloader implements IDownloader{
    @Override
    public void BaixarMusica(User user) {
        System.out.println("O usuario de id"+" "+user.getId()+" "+"esta habilitado a baixar musicas");
    }
}
