package ru.inno.task;

public class Main {
    public static void main(String[] args) {
        Fraction fr = new Fraction(2, 3);
        Fractionable num = Utils.cache(fr);
        System.out.println("--- 1 ---");
        System.out.println(" = " + num.doubleValue());
        System.out.println("--- 2 ---");
        System.out.println(" = " + num.doubleValue());
        System.out.println("--- 3 ---");
        System.out.println(" = " + num.doubleValue());
        System.out.println("--- 4 ---");
        num.setDenum(5);
        System.out.println("--- 5 ---");
        System.out.println(" = " + num.doubleValue());
        System.out.println("--- 6 ---");
        System.out.println(" = " + num.doubleValue());
        System.out.println("--- 7 ---");
        num.setDenum(4);
        System.out.println("--- 8 ---");
        System.out.println(" = " + num.doubleValue());
        System.out.println("--- 9 ---");
        System.out.println(" = " + num.doubleValue());
        System.out.println("--- 10 ---");
    }
}