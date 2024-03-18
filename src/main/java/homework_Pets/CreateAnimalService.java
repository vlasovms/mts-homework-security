package homework_Pets;

public interface CreateAnimalService {
    default void createAnimals() {
        int i = 0;
        while (i < 10) {
            AbstractAnimal.createRandomAnimal();
            i++;
        }
    }
}