package Decorator.Java;

public class ProfessionDecorator implements Person {
    private Person person;
    private String profession;

    public ProfessionDecorator(Person person, String profession) {
        this.person = person;
        this.profession = profession;
    }

    @Override
    public String getInformation() {
        return person.getInformation() + ", Profession: " + profession;
    }
}
