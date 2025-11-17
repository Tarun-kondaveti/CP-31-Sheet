import java.util.*;
public class IIya{
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     int len = s.length();
     int n = sc.nextInt();
     int[][] arr = new int[n][2];
     for(int i = 0 ; i < n ; i++){
        arr[i][0] = sc.nextInt();
        arr[i][1] = sc.nextInt();
     }
     int[] dp = new int[len];
     dp[0] = 0;
     int cnt = 0;
     for(int i = 1 ; i < len ; i++){
        if(s.charAt(i) == s.charAt(i-1)){
            cnt++;
        }
        dp[i] = cnt;
     }
     for(int i = 0 ; i < n ;i++){
        System.out.println(dp[arr[i][1]-1] - dp[arr[i][0]-1]);
     }
     sc.close();
    }
}