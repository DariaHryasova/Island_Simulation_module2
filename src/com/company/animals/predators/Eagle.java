package com.company.animals.predators;

import com.company.animals.AnimalCharacteristics;
import com.company.animals.AnimalType;
import com.company.island.Island;

public class Eagle extends Predators {
    public Eagle(Island island, AnimalCharacteristics animalCharacteristics) {
        super(island, animalCharacteristics);
    }

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.EAGLE;
    }
}
