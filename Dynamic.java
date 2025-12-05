import java.util.Arrays;

public class Dynamic {

    static int[] dp = new int[100];
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        if (dp[n] != -1) {   // already computed
            return dp[n];
        }

        dp[n] = fib(n - 1) + fib(n - 2);  // store result
        return dp[n];
    }
    public static void main(String[] args) {
        Arrays.fill(dp, -1);  // initialize dp with -1
        int n = 6;
        System.out.println("Fibonacci of " + n + " = " + fib(n));
    }
}
