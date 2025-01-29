package javaclass_04;

public class JumpStatements {
        public static void main(String[] args) {
            System.out.println("Break Statement:");
            for (int i = 1; i <= 5; i++) {
                if (i == 3) {
                    break; // Exit the loop when i == 3
                }
                System.out.println("i = " + i);
            }

            System.out.println("\nContinue Statement:");
            for (int i = 1; i <= 5; i++) {
                if (i == 3) {
                    continue;
                }
                System.out.println("i = " + i);
            }
        }
}
