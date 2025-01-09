public class CountingSort {
    public static void main(String args[]){
        int [] inputArray =  {4,3,12,1,5,5,3,9};
        countSort(inputArray);
    }
    public static void countSort(int [] inputArray){
        int step = 0; 
        int N = inputArray.length;
        int M= 0;
        for (int i = 0; i <N ; i++){
            M = Math.max(M,inputArray[i]);
        }
        int [] countArray =  new int[M+1];
        for (int i = 0 ; i<=M ; i++){
            step++;
            countArray[i] = 0;
            step++;
        }
        step++;
        for (int i = 0 ; i<N ; i++){
            step++;
            countArray[inputArray[i]]++;
            step++;
        }
        step++;
        for(int i = 1; i<=M ; i++){
            step++;
            countArray[i] = countArray[i] + countArray[i-1];
            step++;
        }
        step++;
        int [] outputArray = new int[N];
        for(int i = N-1 ; i>=0; i--){
            step++;
            outputArray[countArray[inputArray[i]]-1] = inputArray[i];
            step++;
            countArray[inputArray[i]]--;
            step++;
        }
        step++;
        System.out.println("Step: "+step);
    }
}