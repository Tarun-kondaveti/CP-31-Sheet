// https://codeforces.com/contest/1036/problem/C -- Classy Numbers

import java.util.*;
public class dp1 {
    static String s;
    static long[][][] dp;
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long l,r;
            l = sc.nextLong();
            r = sc.nextLong();
            s = String.valueOf(r);
            dp = new long[20][2][4];
            for(long[][] rows : dp) for(long[] row : rows) Arrays.fill(row,-1);
            long ans1 = helper(0,1,0);
            s = String.valueOf(l-1);
            for(long[][] rows : dp) for(long[] row : rows) Arrays.fill(row,-1);
            long ans2 = helper(0,1,0);
            System.out.println(Math.abs(ans1-ans2));
        }
        sc.close();

    }
    private static long helper(int pos,int flag,int cnt){ 
        if(pos == s.length()) return 1;
        if(dp[pos][flag][cnt] != -1) return dp[pos][flag][cnt];
        int maxi;
        long res = 0;
        if(flag == 1) maxi = s.charAt(pos) - '0'; 
        else maxi = 9;
        for(int i = 0 ; i <= maxi ; i++){
            int updateCnt = i == 0 ? cnt : cnt + 1;
            if(updateCnt <= 3){
                int updatedFlag = flag == 1 && i == s.charAt(pos) - '0' ? 1 : 0;
                res += helper(pos+1,updatedFlag,updateCnt);
            }
        }
        return dp[pos][flag][cnt] = res;
    }
}
