package healers;

import healers.items.Heal;
import healers.items.HealType;
import melee.Dwarf;
import melee.weapons.RarityType;
import melee.weapons.Weapon;
import melee.weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Dwarf dwarf;
    Weapon sword;
    Cleric cleric;
    Heal potion;
    Heal herb;

    @Before
    public void setUp(){
        herb = new Heal("Longbottom Leaf", HealType.HERB);
        potion = new Heal("Minor Heal Potion", HealType.POTION);
        sword = new Weapon("Bronze Sword", WeaponType.SWORD, RarityType.COMMON);
        dwarf = new Dwarf("Gloin", 100, sword);
        cleric = new Cleric("Dr.Healsalot", 100, potion);
    }

    @Test
    public void hasName(){
        assertEquals("Dr.Healsalot", cleric.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(100, cleric.getHealthPoints());
    }

    @Test
    public void canHeal(){
        cleric.heal(dwarf);
        assertEquals(120, dwarf.getHealthPoints());
    }

    @Test
    public void canSwapHeal(){
        cleric.setHeal(herb);
        cleric.heal(dwarf);
        assertEquals(110, dwarf.getHealthPoints());
    }
}
