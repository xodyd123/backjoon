import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] dp = new int[num+1];
        dp[0] = 1 ;
        for (int i = 1; i <= num; i++) { // 2  3  4
            if (i > 1) {
                dp[i] = (dp[i-1] + dp[i-2]) %10007  ;
            }
            else {
                dp[i] =  1 ;
            }
        }

        System.out.println(dp[num]);

    }
}