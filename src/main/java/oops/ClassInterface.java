package oops;

interface ClassInterface {// define an interface
    void number(int num1, int num2); //define empty method

    class MaxNum implements ClassInterface { //implement interface
        public void number(int num1, int num2) { //implement empty method
            System.out.println("Two numbers are: "+num1+" & "+num2);
            if (num1 >= num2) {
                System.out.println("Maximum number is: "+num1);
            } else {
                System.out.println("Maximum number is: "+num2);
            }
        }
    }
    class MinNum implements ClassInterface {
        public void number(int num1, int num2) {
            System.out.println("Two numbers are: "+num1+" & "+num2);

            if (num1 <= num2) {
                System.out.println("Minimum number is: "+num1);
            } else {
                System.out.println("Minimum number is: "+num2);
            }
            }
        }

    static void main(String[] args) {
        MaxNum count = new MaxNum();
        count.number(200,432);
        MinNum num = new MinNum();
        num.number(43,53);

    }
}
