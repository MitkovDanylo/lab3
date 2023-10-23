public class FactorialCalculator {
    public static long recursionExecute(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursionExecute(n - 1);
        }
    }

    public static long cycleExecute(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        long resultRecursion = recursionExecute(n);
        long resultCycle = cycleExecute(n);

        assert resultRecursion == resultCycle : "Different values";

        System.out.println("N: " + n);
        System.out.println("Result (Recursion): " + resultRecursion);
        System.out.println("Result (Cycle): " + resultCycle);
    }
}
