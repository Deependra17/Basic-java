package thread;

public class ThreadDemo extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread!");
        }
    }

    public static void main(String[] args) {
        ThreadDemo obj = new ThreadDemo();
        obj.start();
    }
}
