// start(): Starts the execution of a thread. This internally calls the run() method.
// run(): Contains the code that the thread executes when started.
// sleep(long millis): Pauses the thread for the specified duration.
// join(): Causes the current thread to wait until the thread on which join() is called terminates.
// yield(): Pauses the current executing thread to give others a chance to execute.
// interrupt(): Interrupts a thread that is in sleep or waiting state.
// isAlive(): Checks if the thread is still running.

// public class multithreading {
    
// }

class NumberRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class LetterRunnable implements Runnable {
    @Override
    public void run() {
        char[] letters = {'A', 'B', 'C', 'D', 'E'};
        for (char letter : letters) {
            System.out.println("Letter: " + letter);
            try {
                Thread.sleep(1500); // Sleep for 1.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class multithreading {
    public static void main(String[] args) {
        // Create instances of Runnable
        Runnable numberRunnable = new NumberRunnable();
        Runnable letterRunnable = new LetterRunnable();

        // Create threads with the Runnable instances
        Thread numberThread = new Thread(numberRunnable);
        Thread letterThread = new Thread(letterRunnable);

        // Start both threads
        numberThread.start();
        letterThread.start();

        // Wait for both threads to finish
        try {
            numberThread.join();
            letterThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished execution.");
    }
}

