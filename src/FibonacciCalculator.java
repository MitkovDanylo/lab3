public class FibonacciCalculator {
    public static int recursionExecute(int n) {
        if (n <= 1) {
            return n;
        }
        return recursionExecute(n - 1) + recursionExecute(n - 2);
    }

    public static int cycleExecute(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }
        return current;
    }

    public static void main(String[] args) {
        int n = 10;
        int resultRecursion = recursionExecute(n);
        int resultCycle = cycleExecute(n);

        assert resultRecursion == resultCycle : "Different values";

        System.out.println("N: " + n);
        System.out.println("Result (Recursion): " + resultRecursion);
        System.out.println("Result (Cycle): " + resultCycle);
    }
}
