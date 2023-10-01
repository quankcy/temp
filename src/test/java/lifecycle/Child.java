package lifecycle;

public class Child extends Parent{

    static{
        System.out.println("Child static");
    }

    public Child() {
        super("asd");
        System.out.println("Child Constructor");
    }

}
