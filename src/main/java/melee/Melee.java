package melee;

import enemys.Enemy;
import melee.weapons.Weapon;
import models.CharacterModel;

public abstract class Melee extends CharacterModel {

    private Weapon weapon;

    public Melee(String name, int healthPoints, Weapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(Enemy enemy){
        this.weapon.attack(enemy);
    }

}
