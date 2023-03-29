public class RecursiveExamples {
    public static void main(String[] args) {
        // System.out.println(factorial(7));
        System.out.println(fibonacci(1000));
    }

    static long[] answers = new long[1001];

    private static long fibonacci(int n) { // memoization, resurion and store already solves solutions
        if (n == 1 || n == 2)
            return 1;

        if (answers[n] != 0)
            return answers[n];
        
        answers[n] = fibonacci(n - 1) + fibonacci(n - 2);

        return answers[n];
        
        }

    private static int factorial(int n) {
        if (n == 1)
            return 1;

        return n * factorial(n-1);
    }
}
