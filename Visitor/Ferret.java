package Visitor;

public class Ferret implements Animal{
    @Override
    public String accept(Visitor v) {
        return v.visitFerret(this);
    }
}
