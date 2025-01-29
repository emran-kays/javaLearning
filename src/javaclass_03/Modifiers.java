package javaclass_03;

public class Modifiers {
    public String publicField = "I am Public";
    private String privateField = "I am Private";
    protected String protectedField = "I am Protected";
    String defaultField = "I am Default"; // Default (package-private) field

    public void publicMethod() {
        System.out.println("This is a Public Method");
    }

    private void privateMethod() {
        System.out.println("This is a Private Method");
    }

    protected void protectedMethod() {
        System.out.println("This is a Protected Method");
    }

    void defaultMethod() {
        System.out.println("This is a Default Method");
    }

    public String getPrivateField() {
        return privateField;
    }

    public void setPrivateField(String privateField) {
        this.privateField = privateField;
    }

    // Main method
    public static void main(String[] args) {
        Modifiers obj = new Modifiers();

        System.out.println(obj.publicField);
        obj.publicMethod();

        System.out.println("Private Field : " + obj.getPrivateField());
        obj.setPrivateField("New Private Value");
        System.out.println("Updated Private Field: " + obj.getPrivateField());

        System.out.println(obj.protectedField);
        obj.protectedMethod();

        System.out.println(obj.defaultField);
        obj.defaultMethod();

    }
}



