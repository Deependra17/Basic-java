package org.loop;

import java.util.Scanner;

public class WhileLoop {
    public void whileLoop() {
      int i = 0;
      while (i<=4) {
          System.out.println("Hi "+ i);
          int j = 1;
          while (j<=4) { //Nested while loop
              System.out.println("Hello "+j);
              j++;
          }
          i++;
      }
        System.out.println("Exit "+i);
    }
    public void repeatAdditionQuiz() {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
    public static void main(String[] args) {
        WhileLoop obj = new WhileLoop();
        obj.whileLoop();
//        obj.repeatAdditionQuiz();
    }
}
