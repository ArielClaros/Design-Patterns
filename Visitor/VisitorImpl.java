package Visitor;

public class VisitorImpl implements Visitor{
    @Override
    public String visitDog(Dog dog) {
        return "Visit Dog";
    }

    @Override
    public String visitCat(Cat cat) {
        return "Visit Cat";
    }

    @Override
    public String visitFerret(Ferret ferret) {
        return "Visit Ferret";
    }

    public static class Main{
        public static void main(String[] args) {
            Dog dog = new Dog();
            Cat cat = new Cat();
            Ferret ferret = new Ferret();

            Visitor visitor = new VisitorImpl();

            System.out.println(visitor.visitDog(dog));
            System.out.println(visitor.visitCat(cat));
            System.out.println(visitor.visitFerret(ferret));
        }
    }
}
