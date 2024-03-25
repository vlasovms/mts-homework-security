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
        return (AbstractAnimal) AnimalFactory.createAnimal(AnimalTypes.CARP);
    }

    public AbstractAnimal createRandomEagle() {
        return (AbstractAnimal) AnimalFactory.createAnimal(AnimalTypes.EAGLE);
    }

    public void createAnimalOnCondition(int counter) {
        if (counter % 2 == 0) {   //Для чётного значения счётчика создаём карпа, иначе орла
            System.out.println(createRandomCarp());
        } else {
            System.out.println(createRandomEagle());
        }
    }
}
