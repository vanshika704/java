class Resource1 {}
class Resource2 {}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource1 resource1 = new Resource1();
        Resource2 resource2 = new Resource2();

        // Thread 1 tries to lock resource1 then resource2
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked Resource 1");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked Resource 2");
                }
            }
        });

        // Thread 2 tries to lock resource2 then resource1
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked Resource 2");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked Resource 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
