public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr = {6, 10 ,3, 100, 5, 23, 12, 9};
        // selectionSort(arr);
        insertionSort(arr);
        display(arr);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j;
            for (j = i-1; j >= 0 && arr[j] > temp; j--) {
                arr[j+1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }

    private static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int smallestIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[smallestIndex])
                    smallestIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }
}
