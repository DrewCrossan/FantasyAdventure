package melee.weapons;

public enum RarityType {
    COMMON(1.0),
    UNCOMMON(1.15),
    RARE(1.3),
    EPIC(1.6),
    LEGENDARY(2.0);

    private final double value;


    RarityType(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
