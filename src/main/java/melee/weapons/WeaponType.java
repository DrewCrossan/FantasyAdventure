package melee.weapons;

public enum WeaponType {
    SWORD(20),
    AXE(15),
    CLUB(1),
    STAFF(5),
    DAGGER(10),
    MACE(8),
    SPEAR(12);

    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
