public class IteratingArrays {
    public static void main(String[] args) {
        iterateArray();
        int[] arr = {1, 2, 54, 6, 3, 1, 23, 5, 12, 9};
        int index = search(arr, 7);
    }

    /* return index of val, -1 if not there */
    private static int search(int[] arr, int val) {
        // can go through each one, loops through for every thing
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val)
                return i;
        }
        
        return -1;
    }

    private static void iterateArray() {
        int[] arr = {1, 2, 54, 6, 3, 1, 23, 5, 12, 9};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i]);
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
