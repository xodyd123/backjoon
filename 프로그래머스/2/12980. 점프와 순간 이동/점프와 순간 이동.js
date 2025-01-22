function solution(n) {
    let battery = 0;

    while (n > 0) {
        if (n % 2 === 1) {
            battery++; // 나머지가 1일 때 점프
            n--;       // 점프 후 1 감소
        }
        n = Math.floor(n / 2); // 순간이동
    }

    return battery;
}
