public class Hero {
    private long health;
    private String name;

    public Hero(String name, long health) {
        this.name = name;
        this.health = health;
    }

    public void getHit() {
        System.out.println(this.name + " Huhhhhh " + (this.health - 10));
    }
    public void getHeal() {
        System.out.println(this.name + " get Healed " + (this.health + 10));
}
