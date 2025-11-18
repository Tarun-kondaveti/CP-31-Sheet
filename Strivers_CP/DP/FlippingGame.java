// https://codeforces.com/problemset/problem/327/A  
import java.util.*;

public class FlippingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        int cnt = 0;
        int maxi = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                sum++;
            } else {
                sum--;
                cnt++;
            }
            maxi = Math.max(sum, maxi);
            sum = Math.max(0, sum);
        }
        
        System.out.println(maxi + cnt);
        sc.close();
    }
}
