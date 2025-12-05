public class Fibonacciusingrecurssion {
    public static void main(String[] args) {
        int n = 6;
        int[] dp = new int[n + 1];  // FIXED

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {  // changed < n to <= n for full series
            dp[i] = dp[i - 1] + dp[i - 2];
        }

            System.out.print(dp[n] + " ");
        }
    }

