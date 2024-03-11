package newcourse;

public class TernaryOperator {
    public void ternary() {
        int a = 5;

        int result = 0;
        result = a % 2 == 0 ? 10 : 20;
        System.out.println(result);
    }

    public static void main(String[] args) {
        TernaryOperator ter = new TernaryOperator();
        ter.ternary();
    }
}
