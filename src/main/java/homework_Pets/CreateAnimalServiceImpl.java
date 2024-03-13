package homework_Pets;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    public void createAnimals(int n) {
        for (int i = 0; i < n; i++) {
            AbstractAnimal.createRandomAnimal();
        }
    }

    @Override
    public void createAnimals() {
        int i = 0;
        do {
            AbstractAnimal.createRandomAnimal();
            i++;
        }
        while (i < 10);
    }

}
