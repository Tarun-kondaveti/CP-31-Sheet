import java.util.*;

public class CutRibbon {

    static int helper(int n, int[] arr, int i, int[][] dp) {
        if (n == 0) return 0;
        if (n < 0) return Integer.MIN_VALUE;
        if (i == arr.length) return Integer.MIN_VALUE;

        if (dp[n][i] != -1) return dp[n][i];

        int pick = Integer.MIN_VALUE;
        if (n >= arr[i]) {
            int sub = helper(n - arr[i], arr, i, dp);
            if (sub != Integer.MIN_VALUE)
                pick = 1 + sub;
        }

        int notpick = helper(n, arr, i + 1, dp);

        return dp[n][i] = Math.max(pick, notpick);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        int[][] dp = new int[n + 1][3];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        int ans = helper(n, arr, 0, dp);
        System.out.println(ans);
        sc.close();
    }
}
