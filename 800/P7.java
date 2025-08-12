// https://codeforces.com/problemset/problem/1881/A - Don't Try to Count

import java.util.*;
public class P7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String temp = sc.next();
            String s2 = sc.next();
            int cnt = 0;
            StringBuilder s1 = new StringBuilder(temp);
            while(s1.length() <  (m+n)*2){
                if(s1.toString().contains(s2)){
                    break;
                }
                cnt++;
                s1.append(s1);
            }
            if(s1.toString().contains((s2))){
                System.out.println(cnt);
            }
            else {
                System.out.println(-1);
            }
        }
        sc.close();
    }

}