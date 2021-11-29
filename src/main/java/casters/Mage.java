package casters;

import casters.pets.Pet;
import casters.spells.Spell;

public class Mage extends Caster{
    public Mage(String name, int healthPoints, Spell spell, Pet pet) {
        super(name, healthPoints, spell, pet);
    }
}
