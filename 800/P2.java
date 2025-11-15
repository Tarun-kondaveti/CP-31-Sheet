// https://codeforces.com/problemset/problem/1901/A
import java.util.*;
public class P2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int maxDistance = 0;
            int prev = 0;
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
                maxDistance = Math.max(maxDistance,arr[i]-prev);
                prev = arr[i];
            }
            maxDistance = Math.max(maxDistance,2*(x-prev));
            System.out.println(maxDistance);
        }
        sc.close();
    }
}