// https://codeforces.com/problemset/problem/1878/A - How Much Does Daytona Cost?

import java.util.*;
public class P8{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int target = sc.nextInt();
            boolean f = false;
            int[] arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
                if(target == arr[i]) f = true;
            }
            if(f) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}