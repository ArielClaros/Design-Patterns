package Decorator.Java;

// Decorador que agrega lugar de trabajo a una persona
public class WorkplaceDecorator implements Person {
    private Person person;
    private String workplace;

    public WorkplaceDecorator(Person person, String workplace) {
        this.person = person;
        this.workplace = workplace;
    }

    @Override
    public String getInformation() {
        return person.getInformation() + ", Workplace: " + workplace;
    }
}
