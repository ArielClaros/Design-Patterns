package Visitor;

public interface Visitor {
    String visitDog(Dog dog);
    String visitCat(Cat cat);
    String visitFerret(Ferret ferret);
}
