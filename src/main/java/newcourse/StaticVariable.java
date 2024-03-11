package newcourse;

public class StaticVariable {

    static String mobileName; //Static variable
    String brand; //Instance variable

    public void display() {
        StaticVariable.mobileName = "Nothing";
        System.out.println(mobileName + ", " + brand);

    }

    public static void main(String[] args) {
        StaticVariable var = new StaticVariable();
        var.brand = "Samsung";
        StaticVariable.mobileName = "Samsung j7";
        var.display();
        StaticVariable var1 = new StaticVariable();
        var1.brand = "Apple";
        StaticVariable.mobileName = "Iphone 12";
        var1.display();
        StaticVariable var2 = new StaticVariable();
        var1.brand = "Note";
        StaticVariable.mobileName = "Notebook2";
        var2.display();
    }
}
