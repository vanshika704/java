class A extends Thread {
    public int sum = 0;
    public int[] arraynum = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public void run() {
        for (int i = 0; i < arraynum.length; i++) {
            if (arraynum[i] % 2 != 0) {
                sum += arraynum[i];
            }
        }
        System.out.println("The sum of the odd digits is: " + sum);
    }
}

class B extends Thread {
    private int[] arraynum;
    private int sum = 0;

    public B(int[] arraynum) {
        this.arraynum = arraynum;
    }

    public void run() {
        for (int i = 0; i < arraynum.length; i++) {
            if (arraynum[i] % 2 == 0) {
                sum += arraynum[i];
            }
        }
        System.out.println("The sum of the even digits is: " + sum);
    }
}
class C extends Thread{
    
}

public class q1 {
    public static void main(String[] args) {
        A threadA = new A();
        threadA.start();
        
        B threadB = new B(threadA.arraynum);  
        threadB.start();
    }
}
