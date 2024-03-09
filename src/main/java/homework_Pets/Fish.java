package homework_Pets;

public abstract class Fish extends AbstractAnimal {
    private double gillVolume;


    protected Fish(double gillVolume) {
        this.gillVolume = gillVolume;
    }
    protected Fish(String breed, String name, Double cost, String character,double gillVolume){
        super(breed,name,cost,character);
        this.gillVolume = gillVolume;
    }

    protected void setGillVolume(double gillVolume) {
        this.gillVolume = gillVolume;
    }

    protected double getGillVolume() {
        return gillVolume;
    }
}
