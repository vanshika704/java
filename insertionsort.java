public class insertionsort {
    public static void insertionSort(int[] arr) { 
        int c=0;
        
            for (int i = 1; i < arr.length; i++) {
                c++;
                int key = arr[i];
                c++;
                int j = i - 1;
                c++;
    
           
                while (j >= 0 && arr[j] > key) {
                    c++;
                    arr[j + 1] = arr[j];
                    c++;
                    j--;
                    c++;
                    
                                }
                                c++;

            arr[j + 1] = key; 
            c++;
        }
        c++;

    
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.print("count value is" + c);
    }

    public static void main(String[] args) {
        int[] array = {6,11,12,13,14};
        int count=0;
        insertionSort(array);
    }
}
