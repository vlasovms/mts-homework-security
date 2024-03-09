package homework_Pets;

public abstract class Bird extends AbstractAnimal {
    private Double wingspan;
    private Double beakSize;

    protected Bird(Double wingspan, Double beakSize){
        this.wingspan = wingspan;
        this.beakSize = beakSize;
    }
    protected Bird(String breed, String name, Double cost, String character, Double wingspan, Double beakSize){
        super(breed,name,cost,character);
        this.wingspan = wingspan;
        this.beakSize = beakSize;
    }

    public Double getWingspan() {
        return wingspan;
    }

    public Double getBeakSize() {
        return beakSize;
    }

    protected void setWingspan(Double wingspan) {
        this.wingspan = wingspan;
    }

    protected void setBeakSize(Double beakSize) {
        this.beakSize = beakSize;
    }
}
