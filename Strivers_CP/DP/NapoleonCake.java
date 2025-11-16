import java.util.*;
public class NapoleonCake{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i  < n ; i++){
                arr[i] = sc.nextInt();
            }
            int[] dp = new int[n];
            int max = n-1 - arr[n-1];
            for(int i = n-1 ; i >= 0 ; i--){
                 max = Math.min(max,i-arr[i]);
                dp[i] = max >= i ? 0 : 1;
               
            }
            for(int i = 0 ; i < n ; i++){
                System.out.print(dp[i] +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}