package casters.spells;

import casters.spells.ISpell;
import enemys.Enemy;

public class Spell implements ISpell {

    private String name;
    private SpellType type;
    private double damage;

    public Spell(String name, SpellType type, double damage){
        this.name = name;
        this.type = type;
        this.damage = damage;
    }



    public void cast(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}
