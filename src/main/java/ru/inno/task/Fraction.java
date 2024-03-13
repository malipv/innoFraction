package ru.inno.task;


public class Fraction implements Fractionable {
    private int num;
    private int denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    @Mutator
    public void setNum(int num) {
        this.num = num;
        System.out.println(" num = " + num);
    }

    @Mutator
    public void setDenum(int denum) {
        this.denum = denum;
        System.out.println(" denum = " + denum);
    }

    @Override
    @Cache
    public double doubleValue() {
        System.out.println(" Invoke double value");
        return (double) num / denum;
    }
}