public class Player {
    boolean mrWhite;
    String name;

    public Player(String name, boolean mrWhite) {
        this.mrWhite = mrWhite;
        this.name = name;
    }

    public void setMrWhite(boolean mrWhite) {
        this.mrWhite = mrWhite;
    }

    public boolean isMrWhite() {
        return mrWhite;
    }

    @Override
    public String toString() {
        return name;
    }
}
