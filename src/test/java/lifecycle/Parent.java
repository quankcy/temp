package lifecycle;

public class Parent {

    static {
        System.out.println("Parent static");
    }

    public Parent() {
        System.out.println("Parent Default Constructor");
    }

    public Parent(String asd) {
        System.out.println("Parent String Arg Constructor");
    }

}
