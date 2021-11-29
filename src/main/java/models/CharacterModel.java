package models;

public abstract class CharacterModel {

    private String name;
    private int healthPoints;

    public CharacterModel(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;

    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(double damage){
        this.healthPoints -= damage;
    }

    public void getHealed(double value){
        this.healthPoints += value;
    }
}
