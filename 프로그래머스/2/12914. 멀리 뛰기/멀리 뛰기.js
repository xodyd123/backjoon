function solution(n) {
    const MOD = 1234567;
    if (n === 1) return 1;
    if (n === 2) return 2;

    let prev1 = 1; // dp[1]
    let prev2 = 2; // dp[2]
    let current = 0;

    for (let i = 3; i <= n; i++) {
        current = (prev1 + prev2) % MOD; // dp[n] = dp[n-1] + dp[n-2]
        prev1 = prev2;
        prev2 = current;
    }

    return current;
}

