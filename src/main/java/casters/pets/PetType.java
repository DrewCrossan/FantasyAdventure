package casters.pets;

public enum PetType {
    OGRE(40),
    DRAGON(60);

    private final int defend;

    PetType(int defend){
        this.defend = defend;
    }

    public int getDefend() {
        return defend;
    }
}
