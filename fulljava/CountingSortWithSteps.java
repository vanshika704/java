import java.util.Arrays;

public class CountingSortWithSteps {
    public static void countingSort(int[] arr) {
        int steps = 0;

       // finding the max element , arrays.stream krke hrr element ko ek ek krke traverse ktrta h or max number ko nikal deta h
        int max = Arrays.stream(arr).max().orElse(0);
        steps++;

   
        int[] count = new int[max + 1];// ek array bnaya count check krne ke liye 
        steps++;

   
        for (int num : arr) { // for loop lgaya h jisme hrr element ko ek ek krke count array me add kr rha h
            count[num]++;
            steps++;
        }

   
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
            steps++;
        }

  
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
            steps++;
        }

     
        System.arraycopy(output, 0, arr, 0, arr.length);
        steps++;

     
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Total Steps: " + steps);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));
        countingSort(arr);
    }
}
