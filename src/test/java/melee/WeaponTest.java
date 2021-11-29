package melee;

import com.sun.org.apache.xpath.internal.operations.Or;
import enemys.Enemy;
import enemys.Orc;
import melee.weapons.RarityType;
import melee.weapons.Weapon;
import melee.weapons.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Enemy enemy;
    Weapon swordCommon, swordUncommon, swordRare, swordEpic, swordLegendary;
    Weapon axe;
    Weapon club;
    Weapon staff;
    Weapon dagger;
    Weapon mace;
    Weapon spear;

    @Before
    public void setUp(){
        enemy = new Orc("Stone Orc", 100);
        swordCommon = new Weapon("Bronze Sword", WeaponType.SWORD, RarityType.COMMON);
        swordUncommon = new Weapon("Steel Sword", WeaponType.SWORD, RarityType.UNCOMMON);
        swordRare = new Weapon("Elven Sword", WeaponType.SWORD, RarityType.RARE);
        swordEpic = new Weapon("Rune Sword", WeaponType.SWORD, RarityType.EPIC);
        swordLegendary = new Weapon("Dragon Sword", WeaponType.SWORD, RarityType.LEGENDARY);
        axe = new Weapon("Axe", WeaponType.AXE, RarityType.COMMON);
        club = new Weapon("Club", WeaponType.CLUB, RarityType.COMMON);
        staff = new Weapon("Staff", WeaponType.STAFF, RarityType.COMMON);
        dagger = new Weapon("Dagger", WeaponType.DAGGER, RarityType.COMMON);
        mace = new Weapon("Mace", WeaponType.MACE, RarityType.COMMON);
        spear = new Weapon("Spear", WeaponType.SPEAR, RarityType.COMMON);

    }

    @Test
    public void canDamage(){
        swordCommon.attack(enemy);
        assertEquals(80, enemy.getHealthPoints());
    }

    @Test
    public void canDamageUncommon(){
        swordUncommon.attack(enemy);
        assertEquals(77, enemy.getHealthPoints());
    }

    @Test
    public void canDamageRare(){
        swordRare.attack(enemy);
        assertEquals(74, enemy.getHealthPoints());
    }

    @Test
    public void canDamageEpic(){
        swordEpic.attack(enemy);
        assertEquals(68, enemy.getHealthPoints());
    }

    @Test
    public void canDamageLegendary(){
        swordLegendary.attack(enemy);
        assertEquals(60, enemy.getHealthPoints());
    }

    @Test
    public void canDamageAxe(){
        axe.attack(enemy);
        assertEquals(85, enemy.getHealthPoints());
    }

    @Test
    public void canDamageClub(){
        club.attack(enemy);
        assertEquals(99, enemy.getHealthPoints());
    }

    @Test
    public void canDamageStaff(){
        staff.attack(enemy);
        assertEquals(95, enemy.getHealthPoints());
    }

    @Test
    public void canDamageDagger(){
        dagger.attack(enemy);
        assertEquals(90, enemy.getHealthPoints());
    }

    @Test
    public void canDamageMace(){
        mace.attack(enemy);
        assertEquals(92, enemy.getHealthPoints());
    }

    @Test
    public void canDamageSpear(){
        spear.attack(enemy);
        assertEquals(88, enemy.getHealthPoints());
    }

    @Test
    public void canGetWeaponType(){
        assertEquals(WeaponType.SWORD, swordCommon.getType());
        assertEquals(WeaponType.AXE, axe.getType());
    }

    @Test
    public void canGetWeaponRarity(){
        assertEquals(RarityType.COMMON, swordCommon.getRarity());
        assertEquals(RarityType.LEGENDARY, swordLegendary.getRarity());
    }

    @Test
    public void canGetWeaponName(){
        assertEquals("Dragon Sword", swordLegendary.getName());
    }

}
