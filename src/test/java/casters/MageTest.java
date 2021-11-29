package casters;

import casters.pets.Pet;
import casters.pets.PetType;
import casters.spells.Spell;
import casters.spells.SpellType;
import enemys.Enemy;
import enemys.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MageTest {

    Mage mage;
    Spell fireball;
    Spell frostbolt;
    Spell shadowbolt;
    Enemy enemy;
    Pet dragon;
    Pet ogre;

    @Before
    public void before(){
        ogre = new Pet("Ug ug", PetType.OGRE);
        dragon = new Pet("Lil drago", PetType.DRAGON);
        enemy = new Orc("Stone Orc", 100);
        shadowbolt = new Spell("Shadowbolt", SpellType.SHADOW, 35);
        frostbolt = new Spell("Frostbolt", SpellType.ICE, 25);
        fireball = new Spell("Fireball", SpellType.FIRE, 30);
        mage = new Mage("Substance", 100, fireball, dragon);

    }

    @Test
    public void hasName(){
        assertEquals("Substance", mage.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, mage.getHealthPoints());
    }

    @Test
    public void canCastSpell(){
        mage.cast(enemy);
        assertEquals(70, enemy.getHealthPoints());
    }

    @Test
    public void canSwapSpell(){
        mage.setSpell(frostbolt);
        mage.cast(enemy);
        assertEquals(75, enemy.getHealthPoints());
    }

    @Test
    public void petCanDefend(){
        mage.defend(mage);
        assertEquals(160, mage.getHealthPoints());
    }

    @Test
    public void canSwapPet(){
        mage.setPet(ogre);
        mage.defend(mage);
        assertEquals(140, mage.getHealthPoints());
    }


}
