


public class fibbonacii {
    public static void main (String args[]){
        int number =10;
        int first = 0;
        int second = 1;
        for (int i = 0 ;i <= number ; i++){
            int nextno = first + second ;
            System.out.println("0");
            System.out.println(nextno);
        first = second;
        second = nextno;
        }
    }
}