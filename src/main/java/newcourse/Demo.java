package newcourse;

public class Demo { //StringBuffer
    public static int factorial(int n) { //Static Method
        if (n == 0) {
            return 1;
        } else {
            return n * (factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Deepen ");
        sb.append("Bohara");
        sb.insert(6, "dra");
        sb.insert(0, "Name: ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        int result = Demo.factorial(5); //Static method can be call directly bye class name
        System.out.println("Factorial of 5: " + result);
    }
}
