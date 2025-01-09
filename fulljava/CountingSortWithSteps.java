import java.util.Arrays;

public class CountingSortWithSteps {
    public static void countingSort(int[] arr) {
        int steps = 0;

        int max = Arrays.stream(arr).max().orElse(0);
        steps += arr.length;

        int[] count = new int[max + 1];
        steps += max + 1;

        for (int num : arr) {
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
            steps += 2;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
        steps += arr.length;

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Total Steps: " + steps);
        System.out.println("Expected Steps: " + (5 * max + 4 * arr.length + 6));
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original Array: " + Arrays.toString(arr));
        countingSort(arr);
    }
}
