package melee.weapons;

import enemys.Enemy;

public class Weapon implements IWeapon {

    private String name;
    private WeaponType type;
    private RarityType rarity;

    public Weapon(String name, WeaponType type, RarityType rarity){
        this.name = name;
        this.type = type;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public WeaponType getType() {
        return type;
    }

    public RarityType getRarity() {
        return rarity;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(type.getDamage() * rarity.getValue());

    }
}
