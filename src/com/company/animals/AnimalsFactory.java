package com.company.animals;

import com.company.animals.herbivores.*;
import com.company.animals.predators.*;
import com.company.config.AnimalsConfig;
import com.company.island.Island;

public class AnimalsFactory {
    private static AnimalsFactory animalsFactoryInstance;

    private AnimalsFactory() {
    }

    public static AnimalsFactory getAnimalsFactoryInstance() {
        if (animalsFactoryInstance == null) {
            animalsFactoryInstance = new AnimalsFactory();
        }
        return animalsFactoryInstance;
    }

    public Animal createAnimal(Island island, AnimalType animalType) {
        Animal animal =
                switch (animalType) {
                    case WOLF -> new Wolf(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.WOLF));
                    case HORSE -> new Horse(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.HORSE));
                    case SNAKE -> new Snake(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.SNAKE));
                    case FOX -> new Fox(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.FOX));
                    case BEAR -> new Bear(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.BEAR));
                    case EAGLE -> new Eagle(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.EAGLE));
                    case DEER -> new Deer(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.DEER));
                    case RABBIT -> new Rabbit(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.RABBIT));
                    case MOUSE -> new Mouse(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.MOUSE));
                    case GOAT -> new Goat(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.GOAT));
                    case SHEEP -> new Sheep(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.SHEEP));
                    case WILD_BOAR -> new WildBoar(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.WILD_BOAR));
                    case BUFFALO -> new Buffalo(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.BUFFALO));
                    case DUCK -> new Duck(island, AnimalsConfig.getAnimalCharacteristics(AnimalType.DUCK));
                    default -> throw new IllegalArgumentException("Not recognized animal type. " + animalType);
                };
        return animal;
    }
}
