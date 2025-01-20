package javaclass_02;

public class UnaryOperator {
    public static void main(String[] args) {
        int x  = 20;
        System.out.println("x++: " + x++); // Post//20
        System.out.println("++x: " + ++x); // Pre//22
        System.out.println("x--: " + x--); // Post//22
        System.out.println("--x: " + --x); // Pre//20
    }
}
