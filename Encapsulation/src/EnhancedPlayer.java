public class EnhancedPlayer {
    private String fullname;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String name) {
        this(name, 200, "Sword");
    }

    public EnhancedPlayer(String name, int health, String weapron) {
        this.fullname = name;
        this.weapon = weapron;
        if (health <= 0) {
            this.healthPercentage = 1;
        } else if (health > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
    }
    public void loseHealth(int damage){
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0 ) {
            System.out.println("Player knocked out of the game");
        }
    }
    public int healthRemaining(){
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth){
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage >= 100){
            System.out.println("Player restored to 100");
            healthPercentage = 100;
        }
    }

}
