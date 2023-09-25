package Visitor.Java;

public interface Visitor {
    String visitDog(Dog dog);
    String visitCat(Cat cat);
    String visitFerret(Ferret ferret);
    String visitRabbit(Rabbit rabbit);
}
