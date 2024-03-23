package homework_Pets;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface AnimalRepository {
    Map<String, LocalDate> findLeapYearNames(List<Animal> animalList);

    Map<Animal, Integer> findOlderAnimal(List<Animal> animalList, Integer minAge);

    Map<String, Integer> findDuplicate(List<Animal> animalList);
}
