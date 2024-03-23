package homework_Pets;

import java.util.List;
import java.util.Map;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    public Map<String, List<Animal>> createAnimals(int n) {
        return AbstractAnimal.createRandomAnimalsMap();
    }

    @Override
    public Map<String, List<Animal>> createAnimals() {
        return AbstractAnimal.createRandomAnimalsMap();
    }

    public AbstractAnimal createRandomCarp() {
        return new Carp(Randomizer.generateUUID(), Randomizer.generateUUID(), Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateUUID(), Randomizer.generateRandomDouble(0.0, 11.0), Randomizer.generateUUID(), Randomizer.generateRandomBirthDate());
    }

    public AbstractAnimal createRandomEagle() {
        return new Eagle(Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateUUID(), Randomizer.generateUUID(), Randomizer.generateUUID(), Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateUUID(), Randomizer.generateRandomBirthDate());
    }

    public void createAnimalOnCondition(int counter) {
        if (counter % 2 == 0) {   //Для чётного значения счётчика создаём карпа, иначе орла
            System.out.println(createRandomCarp());
        } else {
            System.out.println(createRandomEagle());
        }
    }
}
