package lifecycle;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class LifecycleUT {

    @Test
    public void getStaticFinalField() {
        String staticFinalProperty = SomeClass.STATIC_FINAL_PROPERTY;
    }

    @Test
    public void getStaticField() {
        String staticProperty = SomeClass.staticProperty;
    }

    @Test
    public void runOnlyStaticMethod() {
        SomeClass.staticMethod();
    }

    @Test
    public void runDefaultConstructor() {
        new SomeClass();
    }

    @Test
    public void runSingleStringArgConstructor() {
        new SomeClass("some new value");
    }

    @Test
    public void runConstructorUsingDifferentConstructor() {
        new SomeClass(Optional.of("some new value"));
    }

    @Test
    public void runStaticMethodThenConstructor() {
        SomeClass.staticMethod();

        new SomeClass("some new value");
    }

    @Test
    public void runConstructorThenStaticMethod() {
        new SomeClass("some new value");

        SomeClass.staticMethod();
    }

    @Test
    public void runStaticMethodFewTimes() {
        SomeClass.staticMethod();
        SomeClass.staticMethod();
        SomeClass.setStaticProperty("new static property");
        SomeClass.staticMethod();
    }

    @Test
    public void createFewObjects(){
        new SomeClass("some new value");
        new SomeClass(Optional.of("some another value"));
    }

    @Test
    public void createFewObjectsAndCheckProperties(){
        SomeClass.staticMethod();
        SomeClass object1 = new SomeClass("object 1");
//        SomeClass.staticMethod();
        SomeClass object2 = new SomeClass("object 2");
        SomeClass.staticMethod();
    }

    @Test
    public void childParent(){
        new Child();
    }

    /*
    Podusmowanie:
        1) Zmienne finalne statyczne bez calej reszty
        2) Bloki statyczne i zmienne statyczne ( nie mylic z final )
        - konstruktory
        - statyczne metody


     */

}
