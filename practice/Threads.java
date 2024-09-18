class NumberThread extends Thread {
    @Override 
    public void run (){
        for (int i=0 ; i<=5 ; i++){
            System.out.println("Number: " +i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
// class LetterThread extends Thread {

//     @Override
//     public void run (){
//         char [] letters = {'A','B','C','D','E'};
//      for (char letter : letters) {
//         System.out.println("Letter: " + letter);
//         try {
//             Thread.sleep(1500); // Sleep for 1.5 seconds
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }}
// }
public class Threads  {
    public static void main(String[] args) {
        // Create instances of each thread
        NumberThread numberThread = new NumberThread();
        // LetterThread letterThread = new LetterThread();

        // Start both threads
        numberThread.start();
        // letterThread.start();

        // Wait for both threads to finish
        try {
            numberThread.join();
            // letterThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads have finished execution.");
    }
}
