package lifecycle;

public class DefaultConstructorUsingDifferentConstructor {

    public DefaultConstructorUsingDifferentConstructor() {
        this("someValue");
        System.out.println("Default Constructor");
    }

    public DefaultConstructorUsingDifferentConstructor(String someValue) {
        System.out.println("Constructor with "+someValue);
    }
}
