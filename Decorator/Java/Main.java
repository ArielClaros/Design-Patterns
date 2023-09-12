package Decorator.Java;

public class Main {
    public static void main(String[] args) {
        Person student = new Stutend("Juan Perez", 2020);

        student = new ProfessionDecorator(student, "Engineer");
        student = new WorkplaceDecorator(student, "Empress ABC");

        System.out.println(student.getInformation());
    }
}