package exceptionhandling;

public class SampleException {
    int a = 10;
    int b = 0;

    public static void main(String[] args) {
        SampleException sam = new SampleException();
        sam.divide();
        sam.arrayException();
    }

    public void divide() {
        try {       //some code may have exception
            int c = (a / b); // through error! because b is zero
            System.out.println(c);
        } catch (ArithmeticException e) {           //handle the exception
            System.out.println("Divided by zero.");
        }
        finally {
            System.out.println("The End of divide");
        }
    }

    public void arrayException() {

        try {
            int a[] = new int[10]; //// the last element is a[9], without a[10]
            a[10] = 100; //it will through an exception because the index is out of bound
            if (a[10] > 0) throw new ArrayIndexOutOfBoundsException("Error!");
//            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage()); //Alert
        } finally {
            System.out.println("The End"); //Must execute
        }
    }
}
