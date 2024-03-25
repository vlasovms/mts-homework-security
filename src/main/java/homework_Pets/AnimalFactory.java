package homework_Pets;

public class AnimalFactory {
    public static Animal createAnimal(AnimalTypes type) {
        Animal animal = null;
        switch (type) {
            case CARP:
                animal = new Carp(Randomizer.generateUUID(), Randomizer.generateUUID(), Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateUUID(), Randomizer.generateRandomDouble(0.0, 11.0), Randomizer.generateUUID(), Randomizer.generateRandomBirthDate());
                break;
            case EAGLE:
                animal = new Eagle(Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateUUID(), Randomizer.generateUUID(), Randomizer.generateUUID(), Randomizer.generateRandomDouble(0.0, 111111.0), Randomizer.generateUUID(), Randomizer.generateRandomBirthDate());
                break;
            default:
                throw new IllegalArgumentException("Wrong animal type:" + type);
        }
        return animal;
    }
}
