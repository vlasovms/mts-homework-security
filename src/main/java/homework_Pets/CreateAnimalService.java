package homework_Pets;

public interface CreateAnimalService {
    default void createAnimals() {
        int i = 0;
        while (i < 10) {
            AbstractAnimal animal;
            switch (i) {
                case (0):
                    animal = new Eagle(3334.4, 3.0, "Eeeeaaaaaaar", "American eagle", "tolik", 256.0, "smoothy");
                    break;
                case (1):
                    animal = new Eagle(14.4, 2.0, "Screeeeew", "American eagle", "tolik", 256.0, "smoothy");
                    break;
                case (2):
                    animal = new Eagle(15.4, 2.0, "Eeeeaaaaaaar", "American eagle", "tolik", 256.0, "smoothy");
                    break;
                case (3):
                    animal = new Eagle(164.2, 22.0, "Screeeeew", "American eagle", "tolik", 256.0, "smoothy");
                    break;
                case (4):
                    animal = new Carp("Carped Carp", "boris", 123.0, "Agressive", 2.3, "bread");
                    break;
                case (5):
                    animal = new Carp("Carped Carpo", "boris", 1234.0, "Agressive", 2.3, "bread");
                    break;
                case (6):
                    animal = new Carp("Carped Carporio", "boris", 12345.0, "Agressive", 2.3, "bread");
                    break;
                case (7):
                    animal = new Carp("Carped Carporios", "britva", 12777.0, "Agressive", 2.3, "bread");
                    break;
                case (8):
                    animal = new Carp("Carporios", "britva", 17771.0, "Agressive", 2.3, "bread");
                    break;
                case (9):
                    animal = new Carp("Carporio", "britva", 7777.0, "Agressive", 2.3, "bread");
                    break;
                default:
                    animal = new Carp("Carporio", "britva", 77.0, "Agressive", 2.3, "bread");
                    break;
            }
            System.out.println(animal);
            i++;
        }
    }
}
