public class ProxyDownloader implements IDownloader{
    private IDownloader downloader;

    public ProxyDownloader() {
        downloader = new RealDownloader();
    }

    @Override
    public void BaixarMusica(User user) {
        if(user.isPremiumstatus()){
            downloader.BaixarMusica(user);
        }
        e
            System.out.println("O usuario de id"+" "+user.getId()+" "+"deve adquirir o premium para baixar musicas");
    }
}
