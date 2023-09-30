package lifecycle;

import java.util.Optional;

import static lifecycle.PrettyCliPrint.STATIC_FINAL_STRING;
import static lifecycle.PrettyCliPrint.STATIC_STRING;
import static lifecycle.PrettyCliPrint.STRING;
import static lifecycle.PrettyCliPrint.changed;
import static lifecycle.PrettyCliPrint.error;
import static lifecycle.PrettyCliPrint.same;

public class SomeClass {

    static {
        System.out.println("-------- STATIC: block BEFORE static and object properties");
        same(STATIC_FINAL_STRING, SomeClass.STATIC_FINAL_PROPERTY);
        same(STATIC_STRING, SomeClass.staticProperty);
        error(STRING, "CAN'T BE INVOKED FROM STATIC BLOCK!!!");
        System.out.println("");
    }

    public static final String STATIC_FINAL_PROPERTY = "static final property value";
    public static String staticProperty = "static property value";
    private String objectProperty = "object property value";

    static {
        System.out.println("-------- STATIC: block AFTER static and dynamic properties");
        same(STATIC_FINAL_STRING, SomeClass.STATIC_FINAL_PROPERTY);
        changed(STATIC_STRING, SomeClass.staticProperty);
        error(STRING, "CAN'T BE INVOKED FROM STATIC BLOCK!!!");
        System.out.println("");
    }

    static {
        SomeClass.staticProperty = "second static block static property value";
        System.out.println("-------- STATIC: block AFTER other static block");
        same(STATIC_FINAL_STRING, SomeClass.STATIC_FINAL_PROPERTY);
        changed(STATIC_STRING, SomeClass.staticProperty);
        error(STRING, "CAN'T BE INVOKED FROM STATIC BLOCK!!!");
        System.out.println("");
    }

    SomeClass() {
        System.out.println("-------- OBJECT: CONSTRUCTOR SomeClass()");
        same(STATIC_FINAL_STRING, SomeClass.STATIC_FINAL_PROPERTY);
        same(STATIC_STRING, SomeClass.staticProperty);
        changed(STRING, this.objectProperty);
        System.out.println("");
    }

    SomeClass(String someNewValue) {
        this.objectProperty = someNewValue;
        System.out.println("-------- OBJECT: CONSTRUCTOR SomeClass(String someNewValue)");
        same(STATIC_FINAL_STRING, SomeClass.STATIC_FINAL_PROPERTY);
        same(STATIC_STRING, SomeClass.staticProperty);
        changed(STRING, this.objectProperty);
        System.out.println("");
    }

    SomeClass(Optional<String> someNewOptionalValue) {
        this(someNewOptionalValue.get());
        System.out.println("-------- OBJECT: CONSTRUCTOR SomeClass(Optional<String> someNewOptionalValue)");
        same(STATIC_FINAL_STRING, SomeClass.STATIC_FINAL_PROPERTY);
        same(STATIC_STRING, SomeClass.staticProperty);
        same(STRING, this.objectProperty);
        System.out.println("");
    }

    void objectMethod() {
        System.out.println("-------- OBJECT: object method");
        same(STATIC_FINAL_STRING, SomeClass.STATIC_FINAL_PROPERTY);
        same(STATIC_STRING, SomeClass.staticProperty);
        same(STRING, this.objectProperty);
        System.out.println("");
    }

    static void staticMethod() {
        System.out.println("-------- STATIC: static method");
        same(STATIC_FINAL_STRING, SomeClass.STATIC_FINAL_PROPERTY);
        same(STATIC_STRING, SomeClass.staticProperty);
        error(STRING, "CAN'T BE INVOKED FROM STATIC BLOCK!!!");
        System.out.println("");
    }

    static void setStaticProperty(String newStaticProperty) {
        SomeClass.staticProperty = newStaticProperty;
        System.out.println("-------- STATIC: set static property");
        same(STATIC_FINAL_STRING, SomeClass.STATIC_FINAL_PROPERTY);
        changed(STATIC_STRING, SomeClass.staticProperty);
        error(STRING, "CAN'T BE INVOKED FROM STATIC BLOCK!!!");
        System.out.println("");
    }

}
