package org.loop;

public class DoWhile {

    public void doWhile(){
        int i = 5;

        do {
            System.out.println("Hi "+i);
            i++;
        } while (i <= 4);
    }

    public static void main(String[] args) {
        DoWhile obj = new DoWhile();
        obj.doWhile();
    }

}
