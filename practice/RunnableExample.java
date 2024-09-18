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

public class RunnableExample {
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
