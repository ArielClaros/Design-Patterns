package Visitor.Java;

public class Rabbit implements Animal{
    private String specie;
    private String diet;
    private double quantityOfFood;

    public Rabbit(String specie, String diet, double quantityOfFood){
        this.specie = specie;
        this.diet = diet;
        this.quantityOfFood = quantityOfFood;
    }

    @Override
    public String getSpecie() {
        return specie;
    }

    @Override
    public String getDiet() {
        return diet;
    }

    @Override
    public Double getHowMuchEat() {
        return quantityOfFood;
    }

    @Override
    public String accept(Visitor v) {
        return v.visitRabbit(this);
    }
}
