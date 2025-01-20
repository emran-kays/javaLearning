package javaclass_01;

public class Variables {

    String variable = "emran kays";
    int variable_1 = 10;
    double variable_2 = 10.5;
    char variable_3 = 'A';
    boolean variable_4 = true ;

    public void display(){
        System.out.println(variable);
        System.out.println(variable_1);
        System.out.println(variable_2);
        System.out.println(variable_3);
        System.out.println(variable_4);
    }
    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.display();
    }
}
