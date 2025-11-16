// https://codeforces.com/problemset/problem/894/A - QAQ

import java.util.*;
public class QAQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = "QAQ";
        int ans = helper(s,t,s.length()-1,2);
        System.out.println(ans);
        sc.close();
    }
    private static int helper(String s, String t,int i,int j){
        if(j == -1) return 1;
        if(i == -1) return 0;
        int cnt = 0;
        if(s.charAt(i) == t.charAt(j)){
            cnt += helper(s,t,i-1,j-1);
            cnt += helper(s,t,i-1,j);
        }
        else{
            cnt += helper(s,t,i-1,j);
        }
        return cnt;
    }
}