// https://codeforces.com/problemset/problem/1900/A

import java.util.*;
public class P3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            int cnt = 0;
            if(s.contains("...")) {
                System.out.println(2);
                continue;
            }
            for(int i = 0 ; i < n ; i++){
                if(s.charAt(i) == '.') cnt++;
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
