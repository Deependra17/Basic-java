package oops;

abstract class Books {
    abstract void read();

    static class eBooks extends Books {
        @Override
        void read() {
            System.out.println("Override abstract method.");
        }
    }

    public static void main(String[] args) {
        eBooks obj= new eBooks();
        obj.read();
    }
}
