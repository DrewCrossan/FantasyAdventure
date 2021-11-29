package healers.items;

import models.CharacterModel;

public class Heal implements IHeal {

    private String name;
    private HealType type;

    public Heal(String name, HealType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public HealType getType() {
        return type;
    }

    public void heal(CharacterModel characterModel) {
        characterModel.getHealed(type.getHeal());
    }
}
