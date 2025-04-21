package patterns;

public class PatternsTask {

    public static void main(String[] args) {
        PatternsTask task = new PatternsTask();
        task.taskOne();
        task.taskTwo();
        task.taskThree();
        task.taskFour();
        task.taskFive();
        task.taskSIx();
        task.taskSeven();
        task.taskEight();
        task.taskNine();
    }


    public void taskOne() {
        /*  *
         *
         *
         *
         */
        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++) { //outer loop
            for (int j = 1; j <= m; j++) {  //inner loop
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void taskTwo() {
        /*
         * * * * *
         *       *
         *       *
         * * * * *
         */
        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) { //outer loop
            //inner loop
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    //cell -> (i,j)
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void taskThree() {
        /*
         *
         * *
         * * *
         * * * *
         */
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void taskFour() {
        int n = 4;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void taskFive() {
        /*
         *
         *  *
         * *  *
         * * * *

         */
        int n = 4;
        for (int i = 1; i <= n; i++) {
            //inner loop space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //inner loop -> star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void taskSIx() {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

         */
        int n = 5;
        //outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void taskSeven() {
        int n = 5;
        //outer loop
//        for (int i = n; i>=1; i--) {
//            //inner loop
//            for (int j=1; j<=i; j++){
//        OR
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void taskEight() {
        /*
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 14 14 15
         */

        int n = 5;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+ " ");
                num++;
            }
            System.out.println();
        }
    }
    //zero - one triangle
    public void taskNine() {
        /*
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
         */

        int n =5;
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                int sum = i+j;
                if(sum%2==0) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
}
