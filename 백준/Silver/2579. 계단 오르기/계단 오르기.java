import java.io.*;
import java.util.Arrays;
public class Main {
    static int[] arr, dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n + 1];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(solve(n));
    }


    public static int solve(int n) {
        if (n == 0) return 0;
        if (n == 1) return arr[1];
        if (n == 2) return arr[1] + arr[2];

        if (dp[n] != 0) return dp[n];



        int max1 = solve(n-2);
        int max2 = solve(n-3) + arr[n-1];

        return dp[n] = Math.max(max1 , max2) + arr[n];

    }
}