public class Largestsubsetdynamic {

    // Function to find the length of the longest increasing subsequence
    public static int longestIncreasingSubsequence(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int[] dp = new int[n];
        // Initialize all dp values to 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // Compute LIS values in bottom up manner
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        // Find the maximum value in dp array
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < dp[i]) {
                max = dp[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 9, 34, 21, 50};
        System.out.println(longestIncreasingSubsequence(arr));
    }
}