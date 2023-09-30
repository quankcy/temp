package lifecycle;

public class DifferentConstructorUsingDefaultConstructor {

    public DifferentConstructorUsingDefaultConstructor() {
        System.out.println("Default Constructor");
    }

    public DifferentConstructorUsingDefaultConstructor(String someValue) {
        this();
        System.out.println("Constructor with " + someValue);
    }

}
