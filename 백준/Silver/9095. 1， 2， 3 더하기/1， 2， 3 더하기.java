import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());  // 테스트 케이스 수

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            dp = new int[n + 1];   // dp 배열 초기화
            for (int j = 0; j <= n; j++) {
                dp[j] = -1;  // -1로 초기화해서 아직 계산하지 않은 상태 표시
            }
            System.out.println(solve(n));
        }
    }

    public static int solve(int n) {
        // 기저 조건
        if (n == 0) return 1;  // 정확히 합이 맞은 경우 하나의 경우로 센다
        if (n < 0) return 0;   // 초과한 경우는 0

        if (dp[n] != -1) return dp[n];  // 이미 계산된 값이면 재사용

        // 점화식: dp[n] = dp[n-1] + dp[n-2] + dp[n-3]
        dp[n] = solve(n - 1) + solve(n - 2) + solve(n - 3);
        return dp[n];
    }
}
