import java.util.Arrays;

public class Factorialofthenumber {
    static long[] memo;
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   // Base case
        }

        if (memo[n] != -1) {
            return memo[n];  // Return already computed factorial
        }

        memo[n] = n * factorial(n - 1); // Recursion + memoization
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 3;   // You can test any number here
        memo = new long[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(factorial(n));
    }
}
