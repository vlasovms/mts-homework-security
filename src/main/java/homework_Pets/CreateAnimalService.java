package homework_Pets;

import java.util.List;
import java.util.Map;

public interface CreateAnimalService {
    default Map<String, List<Animal>> createAnimals() {
        return AbstractAnimal.createRandomAnimalsMap();

    }
}