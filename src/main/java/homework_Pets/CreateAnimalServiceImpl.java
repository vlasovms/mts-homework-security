package homework_Pets;

public class CreateAnimalServiceImpl implements CreateAnimalService {

        public void createAnimals(int N) {
            for (int i = 0; i < N; i++) {
                AbstractAnimal animal;
                switch (i) {
                    case (0):
                        animal = new Eagle(111114.4, 3.0, "Eeeeaaaaaaar", "American eagle", "tolik", 256.0, "smoothy");
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
                        animal = new Carp("Carped Carporios", "britva", 17777.0, "Agressive", 2.3, "bread");
                        break;
                    case (8):
                        animal = new Carp("Carporios", "britva", 1277771.0, "Agressive", 2.3, "bread");
                        break;
                    case (9):
                        animal = new Carp("Carporio", "britva", 17777.0, "Agressive", 2.3, "bread");
                        break;
                    default:
                        animal = new Carp("Carporito", "britva", 1237.0, "Agressive", 2.3, "bread");
                }
                System.out.println(animal);
                i++;
            }
        }
    CreateAnimalService createAnimalDoWhile = new CreateAnimalService() {
        @Override
        public void createAnimals() {
            int i = 0;
            do {
                AbstractAnimal animal;
                switch (i) {
                    case (0):
                        animal = new Eagle(4.4, 3.0, "Eeeeaaaaaaar", "American eagle", "tolik", 256.0, "smoothy");
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
                        animal = new Carp("Carped Carporios", "britva", 1777.0, "Agressive", 2.3, "bread");
                        break;
                    case (8):
                        animal = new Carp("Carporios", "britva", 11.0, "Agressive", 2.3, "bread");
                        break;
                    case (9):
                        animal = new Carp("Carporio", "britva", 177.0, "Agressive", 2.3, "bread");
                        break;
                    default:
                        animal = new Carp("Carporito", "britva", 1777.0, "Agressive", 2.3, "bread");
                }
                System.out.println(animal);
                i++;
            }
            while (i < 10);
        }
    };
}
