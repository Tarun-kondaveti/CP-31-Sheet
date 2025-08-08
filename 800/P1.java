// Problem Link :- https://codeforces.com/problemset/problem/1903/A

import java.util.*;
public class P1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            boolean isSorted = true;
            int prevElement = 0;
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
                if(arr[i] < prevElement) isSorted = false;
                prevElement = arr[i];
            }
            if(k > 1 || isSorted){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
        return;
    }
}