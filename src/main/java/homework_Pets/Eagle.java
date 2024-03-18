package homework_Pets;

import java.time.LocalDate;

public class Eagle extends Bird {
    private String democraticRoar;

    public Eagle() {
    }

    public Eagle(Double wingspan, Double beakSize, String democraticRoar) {
        super(wingspan, beakSize);
        this.democraticRoar = democraticRoar;
    }

    public Eagle(Double wingspan, Double beakSize, String democraticRoar, String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, wingspan, beakSize, birthDate);
        this.democraticRoar = democraticRoar;
    }

    public String getDemocraticRoar() {
        return democraticRoar;
    }

    public void setDemocraticRoar(String democraticRoar) {
        this.democraticRoar = democraticRoar;
    }

    @Override
    public String toString() {
        return "Eagle: " + " breed: " + this.breed + "; " + " name: " + this.name + "; " + " cost: " + this.cost + "; " + " character: " + this.character + "; " + " democraticRoar: " + this.democraticRoar + "; " + " wingspan: " + super.getWingspan() + "; " + " beakSize: " + super.getBeakSize() + " birthDate: " + super.getBirthDate();
    }
}
