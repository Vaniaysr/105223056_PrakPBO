package model;

public abstract class Player {
    protected String name;
    protected double health;
    protected double mana;
    protected double level;
    protected double attackPower;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.mana = 100;
        this.level = 1;
    }

    public double attack() {
        return attackPower + level * 2;
    }

    public void levelUp() {
        level++;
        health += 40;
        mana += 30;
        System.out.println("Level Up! You are now level " + level);
    }

    public void showStatus() {
        System.out.println("=== Player Status ===");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Level: " + level);
    }

    // getters & setters
    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }
    public double getMana() {
        return mana;
    }
    public void setMana(double mana) {
        this.mana = mana;
    }
}
