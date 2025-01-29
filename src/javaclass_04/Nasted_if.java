package javaclass_04;

public class Nasted_if {
    public static void main(String[] args) {
        int age = 20;
        int weight = 55;
        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You are eligible to donate blood.");
            } else {
                System.out.println("You must weigh at least 50kg to donate blood.");
            }
        } else {
            System.out.println("You must be at least 18 years old to donate blood.");
        }
    }
}
