package homework_Pets;

import java.time.LocalDate;
import java.util.*;

public class AnimalsRepositoryImpl implements AnimalRepository {

    @Override
    public Map<String, LocalDate> findLeapYearNames(List<Animal> animalList) {
        Map<String, LocalDate> leapAnimalsMap = new HashMap<>();
        for (Animal animal : animalList) {
            if (animal.getBirthDate().isLeapYear()) {
                leapAnimalsMap.put(animal.getClass().getSimpleName() + " " + animal.getName(), animal.getBirthDate());
            }
        }
        return leapAnimalsMap;
    }

    @Override
    public Map<Animal, Integer> findOlderAnimal(List<Animal> animalList, Integer minAge) {
        Map<Animal, Integer> olderAnimalMap = new HashMap<>();
        for (Animal animal : animalList) {
            int animalAge = animal.getBirthDate().until(LocalDate.now()).getYears();
            if (animalAge > minAge) {
                olderAnimalMap.put(animal, animalAge);
            }
        }
        if (olderAnimalMap.isEmpty()) {
            Animal maxAgeAnimal = Collections.min(animalList, Comparator.comparing(Animal::getBirthDate));    //Ищем животное с минимальной датой рождения, то есть самого старшего
            olderAnimalMap.put(maxAgeAnimal, maxAgeAnimal.getBirthDate().until(LocalDate.now()).getYears());
        }
        return olderAnimalMap;
    }

    public Map<String, Integer> findDuplicate(List<Animal> animalArrayList) {
        Map<String, Integer> dupAnimalMap = new HashMap<>();
        for (Animal animal : animalArrayList) {
            if (dupAnimalMap.containsKey(animal.getClass().getSimpleName())) {   //Если в мапе уже есть животное такого класса, то инкрементируем счётчик этого животного, иначе добавляем название нового животного в мапу с value = 1
                dupAnimalMap.put(animal.getClass().getSimpleName(), dupAnimalMap.get(animal.getClass().getSimpleName()) + 1);
            } else {
                dupAnimalMap.put(animal.getClass().getSimpleName(), 1);
            }
        }
        return dupAnimalMap;
    }
}
