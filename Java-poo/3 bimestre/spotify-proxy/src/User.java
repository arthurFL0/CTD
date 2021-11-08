public class User {
    private int id;
    private boolean premiumstatus;

    public User(int id, boolean premiumstatus) {
        this.id = id;
        this.premiumstatus = premiumstatus;
    }

    public int getId() {
        return id;
    }

    public boolean isPremiumstatus() {
        return premiumstatus;
    }
}
