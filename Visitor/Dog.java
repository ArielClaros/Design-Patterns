package Visitor;

public class Dog implements Animal{
    @Override
    public String accept(Visitor v) {
        return v.visitDog(this);
    }
}
