package healers;

import healers.items.Heal;
import models.CharacterModel;

public abstract class Healer extends CharacterModel {

    Heal heal;


    public Healer(String name, int healthPoints, Heal heal) {
        super(name, healthPoints);
        this.heal = heal;
    }

    public void setHeal(Heal heal){
        this.heal = heal;
    }

    public void heal(CharacterModel characterModel){
        this.heal.heal(characterModel);
    }
}
