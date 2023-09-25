package Visitor.Java;

public class ConcreteVisitor implements Visitor{
    @Override
    public String visitDog(Dog dog) {
        return "The " + dog.getSpecie() +
                " is " + dog.getDiet() +
                " and eats " + dog.getHowMuchEat() +
                " grams a day.";
    }

    @Override
    public String visitCat(Cat cat) {
        return "The " + cat.getSpecie() +
                " is " + cat.getDiet() +
                " and eats " + cat.getHowMuchEat() +
                " grams a day.";
    }

    @Override
    public String visitFerret(Ferret ferret) {
        return "The " + ferret.getSpecie() +
                " is " + ferret.getDiet() +
                " and eats " + ferret.getHowMuchEat() +
                " grams a day.";
    }

    @Override
    public String visitRabbit(Rabbit rabbit) {
        return "The " + rabbit.getSpecie() +
                " is " + rabbit.getDiet() +
                " and eats " + rabbit.getHowMuchEat() +
                " grams a day.";
    }

    public static class Main{
        public static void main(String[] args) {
            Dog dog = new Dog("Dog", "Carnivorous", 100.0);
            Cat cat = new Cat("Cat", "Carnivorous", 70.0);
            Ferret ferret = new Ferret("Ferret", "Carnivorous", 50.0);
            Rabbit rabbit = new Rabbit("Rabbit", "Herbivorous", 60.0);

            Visitor visitor = new ConcreteVisitor();

            System.out.println(visitor.visitDog(dog));
            System.out.println(visitor.visitCat(cat));
            System.out.println(visitor.visitFerret(ferret));
            System.out.println(visitor.visitRabbit(rabbit));
        }
    }
}
