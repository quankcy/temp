package lifecycle;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class LifecycleUT {

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
        new SomeClass("some another value");
    }

    @Test
    public void createFewObjectsAndCheckProperties(){
        SomeClass.staticMethod();
        new SomeClass("some new value");
        SomeClass.staticMethod();
        new SomeClass("some another value");
        SomeClass.staticMethod();
    }

}
