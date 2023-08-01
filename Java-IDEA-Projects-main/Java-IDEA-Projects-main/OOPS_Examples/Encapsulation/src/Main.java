public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.name = "Abhishek";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());


        EnhancedPlayer ePlayer = new EnhancedPlayer("Abhishek", 50, "Katana");
        System.out.println("Initial health is " + ePlayer.getHealth());

    }
}
