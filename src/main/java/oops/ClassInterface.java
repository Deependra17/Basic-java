package oops;

interface Copys { // define an interface
    void copysNumber(); //define empty method

    class eCopys implements Copys { //implement interface
        public void copysNumber() { //implement empty method
            System.out.println("Implements the empty method.");
        }
    }

    static void main(String[] args) {
        eCopys count = new eCopys();
        count.copysNumber();
    }
}
