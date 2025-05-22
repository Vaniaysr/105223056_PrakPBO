package enemy;

public class Beast {
    private String name;
    private double health;
    private double attackPower;

    public Beast(String name, double health, double attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttackPower() {
        return attackPower;
    }
}
