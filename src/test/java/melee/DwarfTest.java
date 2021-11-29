package melee;

import enemys.Enemy;
import enemys.Orc;
import melee.weapons.RarityType;
import melee.weapons.Weapon;
import melee.weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Enemy enemy;
    Weapon sword;
    Weapon axe;

    @Before
    public void setUp(){
        sword = new Weapon("Iron Longsword", WeaponType.SWORD, RarityType.COMMON);
        axe = new Weapon("Axe of the Gronn Lords", WeaponType.AXE, RarityType.EPIC);
        enemy = new Orc("Stone Orc", 100);
        dwarf = new Dwarf("Gimli", 100, sword);
    }

    @Test
    public void hasName(){
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, dwarf.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        dwarf.takeDamage(10);
        assertEquals(90, dwarf.getHealthPoints());
    }

    @Test
    public void canAttack(){
        dwarf.attack(enemy);
        assertEquals(80, enemy.getHealthPoints());
    }

    @Test
    public void canSwapWeapon(){
        dwarf.setWeapon(axe);
        dwarf.attack(enemy);
        assertEquals(76, enemy.getHealthPoints());
    }
}
