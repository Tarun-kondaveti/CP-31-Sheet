import java.util.*;

public class RedAndBlue {
    private static int helper(int[] red, int[] blue, int i, int j, int[][] dp, int n, int m) {
        if (i == n && j == m) return 0;
        if (dp[i][j] != -1) return dp[i][j];

        int takeRed = Integer.MIN_VALUE;
        int takeBlue = Integer.MIN_VALUE;

        if (j < m) {
            takeBlue = blue[j] + helper(red, blue, i, j + 1, dp, n, m);
        }
        if (i < n) {
            takeRed = red[i] + helper(red, blue, i + 1, j, dp, n, m);
        }

        return dp[i][j] = Math.max(0, Math.max(takeRed, takeBlue));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] red = new int[n];
            for (int i = 0; i < n; i++) red[i] = sc.nextInt();

            int m = sc.nextInt();
            int[] blue = new int[m];
            for (int i = 0; i < m; i++) blue[i] = sc.nextInt();
            int[][] dp = new int[n + 1][m + 1];
            for (int[] row : dp) Arrays.fill(row, -1);

            int maxi = helper(red, blue, 0, 0, dp, n, m);
            System.out.println(maxi);
        }
        sc.close();
    }
}
