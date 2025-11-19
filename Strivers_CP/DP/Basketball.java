import java.util.*;

public class Basketball {

    static long helper(int[] row1, int[] row2, int i, int prev, long[][] dp) {
        if (i == row1.length) return 0;

        if (dp[i][prev] != -1)
            return dp[i][prev];

        long res;
        if (prev == 0) {
            res = Math.max(
                    helper(row1, row2, i + 1, prev, dp),
                    row2[i] + helper(row1, row2, i + 1, 1, dp)
            );
        } else {
            res = Math.max(
                    helper(row1, row2, i + 1, prev, dp),
                    row1[i] + helper(row1, row2, i + 1, 0, dp)
            );
        }

        return dp[i][prev] = res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] row1 = new int[n];
        int[] row2 = new int[n];

        for (int i = 0; i < n; i++) row1[i] = sc.nextInt();
        for (int i = 0; i < n; i++) row2[i] = sc.nextInt();

        long[][] dp = new long[n][2];
        for (long[] row : dp)
            Arrays.fill(row, -1);

        long res = Math.max(
                row1[0] + helper(row1, row2, 1, 0, dp),
                row2[0] + helper(row1, row2, 1, 1, dp)
        );

        System.out.println(res);
        sc.close();
    }
}
