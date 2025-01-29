package javaclass_03;

public class DataType {
        int intValue = 100000;
        long longValue = 10000000000L;
        float floatValue = 3.14f;
        double doubleValue = 3.14159265359;
        char charValue = 'A';
        boolean booleanValue = true;

        String stringValue = "Hello, Java!";

        public void displayDataTypes() {
            System.out.println("Int Value: " + intValue);
            System.out.println("Long Value: " + longValue);
            System.out.println("Float Value: " + floatValue);
            System.out.println("Double Value: " + doubleValue);
            System.out.println("Char Value: " + charValue);
            System.out.println("Boolean Value: " + booleanValue);
            System.out.println("String Value: " + stringValue);
        }

        public static void main(String[] args) {
            DataType example = new DataType();
            example.displayDataTypes();
        }
}
