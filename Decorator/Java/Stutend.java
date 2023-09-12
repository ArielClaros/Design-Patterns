package Decorator.Java;

public class Stutend implements Person {
    private String name;
    private int highSchoolYear;

    public Stutend(String name, int highSchoolYear) {
        this.name = name;
        this.highSchoolYear = highSchoolYear;
    }

    @Override
    public String getInformation() {
        return "Name: " + name + ", High School Year: " + highSchoolYear;
    }
}
