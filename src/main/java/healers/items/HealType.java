package healers.items;

public enum HealType {
    POTION(20),
    HERB(10);

    private final int heal;


    HealType(int heal) {
        this.heal = heal;
    }

    public int getHeal() {
        return heal;
    }
}
