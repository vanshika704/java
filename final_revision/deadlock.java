class Resource {
    String name;

    public Resource(String name) {
        this.name = name;
    }
}

public class DeadlockExample {
    public static void main(String[] args) {
        Resource resourceA = new Resource("Resource-A");
        Resource resourceB = new Resource("Resource-B");

        // Thread-1: Locks resourceA and then tries to lock resourceB
        Thread thread1 = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("Thread-1: Locked " + resourceA.name);

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (resourceB) {
                    System.out.println("Thread-1: Locked " + resourceB.name);
                }
            }
        });

        // Thread-2: Locks resourceB and then tries to lock resourceA
        Thread thread2 = new Thread(() -> {
            synchronized (resourceB) {
                System.out.println("Thread-2: Locked " + resourceB.name);

                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (resourceA) {
                    System.out.println("Thread-2: Locked " + resourceA.name);
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
