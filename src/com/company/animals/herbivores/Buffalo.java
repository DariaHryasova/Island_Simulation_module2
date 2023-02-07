package com.company.animals.herbivores;

import com.company.animals.AnimalCharacteristics;
import com.company.animals.AnimalType;
import com.company.island.Island;

public class Buffalo extends Herbivores {

    public Buffalo(Island island, AnimalCharacteristics animalCharacteristics) {
        super(island, animalCharacteristics);
    }

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.BUFFALO;
    }
}
