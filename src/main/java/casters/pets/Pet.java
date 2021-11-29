package casters.pets;

import casters.Caster;
import enemys.Enemy;

public class Pet implements IPet{

    private String name;
    private PetType type;


    public Pet(String name, PetType type){
        this.name = name;
        this.type = type;
    }


    public void defend(Caster caster) {
        caster.getHealed(type.getDefend());
    }
}
