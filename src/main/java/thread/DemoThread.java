package thread;

public class DemoThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread obj = new Thread(new DemoThread());
        obj.start();
    }
}
