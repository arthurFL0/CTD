public class Sistema {
    public static void main(String[] args) {
        User user1 = new User(1,true);
        User user2 = new User(2,false);

        IDownloader proxy = new ProxyDownloader();

        proxy.BaixarMusica(user1);
        proxy.BaixarMusica(user2);
    }
}
