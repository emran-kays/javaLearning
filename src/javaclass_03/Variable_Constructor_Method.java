package javaclass_03;

public class Variable_Constructor_Method {

    private String name;
    private int age;

    public Variable_Constructor_Method(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Variable_Constructor_Method person1 = new Variable_Constructor_Method("Alice", 25);
        Variable_Constructor_Method person2 = new Variable_Constructor_Method("Bob", 30);

        System.out.println("Details of Person 1:");
        person1.displayDetails();

        System.out.println("Details of Person 2:");
        person2.displayDetails();
    }
}
