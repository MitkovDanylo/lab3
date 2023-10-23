public class DigitSumCalculator {
    public static int execute(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + execute(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;
        int result = execute(n);

        System.out.println("Input: " + n);
        System.out.println("Result: " + result);
    }
}
