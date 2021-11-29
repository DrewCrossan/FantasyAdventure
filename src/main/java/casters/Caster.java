package casters;

import casters.pets.Pet;
import casters.spells.Spell;
import enemys.Enemy;
import models.CharacterModel;

public abstract class Caster extends CharacterModel {

    Spell spell;
    Pet pet;


    public Caster(String name, int healthPoints, Spell spell, Pet pet) {
        super(name, healthPoints);
        this.spell = spell;
        this.pet = pet;
    }

    public void setSpell(Spell spell){
        this.spell = spell;
    }

    public void setPet(Pet pet){
        this.pet = pet;
    }

    public void defend(Caster caster){
        this.pet.defend(caster);
    }

    public void cast(Enemy enemy){
        this.spell.cast(enemy);
    }
}
