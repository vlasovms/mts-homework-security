package homework_Pets;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = AbstractAnimal.createRandomAnimalsList(1000);
        AnimalsRepositoryImpl animalRepository = new AnimalsRepositoryImpl();
        Map<String, Integer> dupAnimalMap = animalRepository.findDuplicate(animalList);
        Map<Animal, Integer> olderAnimalMap = animalRepository.findOlderAnimal(animalList, 30);
        Map<String, LocalDate> leapYearAnimalMap = animalRepository.findLeapYearNames(animalList);
        System.out.println(dupAnimalMap);
        System.out.println(olderAnimalMap);
        System.out.println(leapYearAnimalMap);
    }
}