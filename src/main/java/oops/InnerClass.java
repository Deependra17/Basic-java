package oops;

abstract class InnerClass {

    public abstract void show();
    public abstract void config();


    public static void main(String[] args) {
        InnerClass obj = new InnerClass() {
            public void show() {
                System.out.println("Inner class");
            }
            public void config()
            {
                System.out.println("Config method");
            }
        };
        obj.show();
        obj.config();
    }
}