package homework_Pets;

import java.time.LocalDate;
import java.util.*;

public abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected Double cost;
    protected String character;
    protected LocalDate birthDate;

    public AbstractAnimal() {
    }

    public AbstractAnimal(String breed, String name, Double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public static Map<String, List<Animal>> createRandomAnimalsMap() {
        Map<String, List<Animal>> map = new HashMap<>();
        List<Animal> eaglesList = new ArrayList<>();
        List<Animal> carpList = new ArrayList<>();
        Random random = new Random();
        int eaglesCount = random.nextInt(30);
        int carpsCount = random.nextInt(30);

        for (int i = 0; i < eaglesCount; i++) {
            eaglesList.add(new Eagle(Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateUUID(), Randomizer.generateUUID(), Randomizer.generateUUID(), Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateUUID(), Randomizer.generateRandomBirthDate()));
        }

        for (int i = 0; i < carpsCount; i++) {
            carpList.add(new Carp(Randomizer.generateUUID(), Randomizer.generateUUID(), Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateUUID(), Randomizer.generateRandomDouble(0.0, 11.0), Randomizer.generateUUID(), Randomizer.generateRandomBirthDate()));
        }

        map.put("Eagle", eaglesList);
        map.put("Carp", carpList);
        return map;
    }

    public static List<Animal> createRandomAnimalsList(int maxAnimalCount) {
        List<Animal> animalList = new ArrayList<>();
        Random random = new Random();
        int animalCount = random.nextInt(maxAnimalCount);

        for (int i = 0; i < animalCount; i++) {
            switch (random.nextInt(2)) {
                case 0:
                    animalList.add(new Eagle(Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateUUID(), Randomizer.generateUUID(), Randomizer.generateUUID(), Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateUUID(), Randomizer.generateRandomBirthDate()));
                    break;
                case 1:
                    animalList.add(new Carp(Randomizer.generateUUID(), Randomizer.generateUUID(), Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateUUID(), Randomizer.generateRandomDouble(0.0, 11.0), Randomizer.generateUUID(), Randomizer.generateRandomBirthDate()));
                    break;
            }
        }

        return animalList;
    }

}

