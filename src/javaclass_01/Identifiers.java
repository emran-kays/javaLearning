package javaclass_01;

public class Identifiers {

    String className;
    String variableName;
    String ConstructorName;
    String MethodName;

    public Identifiers(String className, String variableName,String ConstructorName,String MethodName){
        this.className = className;
        this.variableName = variableName;
        this.ConstructorName = ConstructorName;
        this.MethodName = MethodName;
    }
    public void display(){
        System.out.println("class_name = "+className);
        System.out.println("variable = "+variableName);
        System.out.println("constructor = "+ConstructorName);
        System.out.println("method_name = "+MethodName);
    }
}

