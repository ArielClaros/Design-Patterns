package Visitor.Java;

public interface Animal {
    String getSpecie();
    String getDiet();
    Double getHowMuchEat();
    String accept(Visitor v);
}
