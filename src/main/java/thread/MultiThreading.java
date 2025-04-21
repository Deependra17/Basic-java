package thread;

public class MultiThreading extends Thread {
    MultiThreading(String threadName) {
        super(threadName);
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println(getName() + "Running");
        }
    }

    public static void main(String[] args) {
        MultiThreading obj1 = new MultiThreading("Deepen ");
        MultiThreading obj2 = new MultiThreading("Samip ");
        MultiThreading obj3 = new MultiThreading("Manish ");
        obj1.start();
        obj2.start();
        obj3.start();
    }
}
