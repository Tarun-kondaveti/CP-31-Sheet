import java.util.*;

public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int mini = Integer.MAX_VALUE;
        int sum = 0;
        int ans = -1;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        mini = sum;
        ans = 0;
        for (int i = k; i < n; i++) {
            sum += arr[i];
            sum -= arr[i - k];

            if (sum < mini) {
                mini = sum;
                ans = i - k + 1;
            }
        }

        System.out.println(ans + 1);

        sc.close();
    }
}
