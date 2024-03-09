package homework_Pets;

public abstract class AbstractAnimal implements Animal {
    protected String breed; // порода
    protected String name; // имя
    protected Double cost; // цена в магазине
    protected String character; // характер

    protected AbstractAnimal(){
    }
    protected AbstractAnimal(String breed, String name, Double cost, String character){
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
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

    protected void setBreed(String breed) {
        this.breed = breed;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setCost(Double cost) {
        this.cost = cost;
    }

    protected void setCharacter(String character) {
        this.character = character;
    }

}
