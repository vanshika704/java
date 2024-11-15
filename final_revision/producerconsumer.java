import java.util.LinkedList; // import krenge linked list

class Buffer { // create buffer class , which will have linked list in it 
    private LinkedList<Integer> list = new LinkedList<>();
    private final int CAPACITY = 5;


    public synchronized void produce(int value) throws InterruptedException {
        while (list.size() == CAPACITY) {  // Wait if buffer is full
            wait();
        }
        list.add(value);
        System.out.println("Produced: " + value);
        notify();  // Notify the consumer that there is an item to consume
    }

    // Method for the consumer to remove items from the buffer
    public synchronized int consume() throws InterruptedException {
        while (list.isEmpty()) {  // Wait if buffer is empty
            wait();
        }
        int value = list.removeFirst();
        System.out.println("Consumed: " + value);
        notify();  // Notify the producer that there is space in the buffer
        return value;
    }
}

class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int value = 0;
        try {
            while (true) {
                buffer.produce(value);
                value++;
                Thread.sleep(500);  // Simulate time taken to produce
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                buffer.consume();
                Thread.sleep(1000);  // Simulate time taken to consume
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();
    }
}
