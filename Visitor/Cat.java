package Visitor;

public class Cat implements Animal{
    @Override
    public String accept(Visitor v) {
        return v.visitCat(this);
    }
}
