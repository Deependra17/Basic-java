package oops;


public class MainClass {

    public void demo() {
        System.out.println("1st");

}
public static class SubClass extends MainClass {
    public void demo() {
        System.out.println("2nd");
    }

}
public static class SubclassTwo extends MainClass {

    public void demo() {
        System.out.println("third");
    }
}

public static void main(String[] args) {
        //polymorphism
        //Dynamic method dispatch --reference of superclass and object of subclass
        MainClass obj = new MainClass();
        obj.demo();

        obj = new SubClass();
        obj.demo();

        obj = new SubclassTwo();
        obj.demo();

    }
}
