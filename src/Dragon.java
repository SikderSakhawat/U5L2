
public class Dragon {
    private int health;
    private int strength;
    private int level;
    private boolean isDead;

    public Dragon(){
        this.health = 100;
        this.strength = 1;
        this.level = 1;
        this.isDead = false;
    }
    // getter/setter methods
    public int getHealth() {
        return health;
    }
    public int getStrength() {
        return strength;
    }
    public int getLevel() {
        return level;
    }
    public boolean isDead() {
        return isDead;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public void setDead(boolean dead) {
        isDead = dead;
    }

    // other methods
    public void takeDamage(int damage){
        if(health <= 0 && isDead){
            System.out.println("The dragon is already dead!");
        } else if(health <= 0){
            setDead(true);
            System.out.println("The dragon has been slayed!");
        } else {
            setHealth(health - damage);
            System.out.println("The dragon has taken " + damage + " damage, and now has " + health + " health.");
        }
    }

    public void attack(int damage){
        int attackDamage = 0;
        System.out.println("The dragon attacks for " + damage * level + " damage!");
        attackDamage += damage * level;
        if(attackDamage >= 50){
            level++;
            System.out.println("The dragon has reached level " + level);
            attackDamage = 0;
        }
    }
}
