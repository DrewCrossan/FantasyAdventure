package enemys;

import models.CharacterModel;

public abstract class Enemy extends CharacterModel {

    public Enemy(String name, int healthPoints) {
        super(name, healthPoints);
    }
}
