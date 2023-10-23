public class RecursiveAddition {
    public static int execute(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sumWithoutCarry = a ^ b;
        int carry = (a & b) << 1;
        return execute(sumWithoutCarry, carry);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int result = execute(a, b);

        System.out.println("Input a: " + a);
        System.out.println("Input b: " + b);
        System.out.println("Result: " + result);
    }
}
