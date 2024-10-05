//New
// Active
// Blocked / Waiting
// Timed Waiting
// Terminated



class lifecycle extends Thread {
    public void run (){
        System.out.println("Bro party de thread chlgya ");
    }
    public static void main(String[] args) {
        lifecycle t1 = new lifecycle();
        t1.start();
    }
}

 class Multi3 implements Runnable {
    public void run (){
        System.out.println("Ye bhi chlgyi bro party ");
    }
    public static void main(String[] args) {
        Multi3 m1 = new Multi3();
        Thread t1 = new Thread (m1);
        t1.start();
    }
}

// public class MyThread1  
// {  

// public static void main(String argvs[])  
// {  

// Thread t= new Thread("My first thread");  
   
// t.start();  

// String str = t.getName();  
// System.out.println(str);  
// }  
// }  