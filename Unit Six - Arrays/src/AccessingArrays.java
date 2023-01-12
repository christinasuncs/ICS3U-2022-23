public class AccessingArrays {
    public static void main(String[] args) {
        exampleOne();
    }

    private static void exampleOne() {
        // ap notation for creating array
        // declares a reference to a primitive int array
        // initialized in one step
        // seen in mostly AP MC
        int[] arr = {7, 6, 3, 2, 9, 5, 0, 0};

        System.out.println(arr[3] + " is at index 3"); 

        // declare a reference to an array and assign it to an array of size 10 that we created
        int[] simpleArr = new int[10];

        // Student[] students = new Student[CLASS_SIZE];

        simpleArr[5] = (int)(Math.random()*10) + 1;
        System.out.println(arr.length);
    }
}