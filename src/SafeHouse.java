public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("----------------------------------------------------------");
        System.out.println("Güvenli evdesiniz ! ");
        System.out.println("Canınız yenliendi ! ");
        System.out.println("----------------------------------------------------------");
        this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
        return true;

    }

}
