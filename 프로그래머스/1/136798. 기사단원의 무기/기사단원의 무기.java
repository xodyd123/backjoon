public class Solution {
    public int solution(int number, int limit, int power) {
        int[] arr = new int[number];
        for (int i = 1; i <= number; i++) {
            int divisorCount = 0;
            boolean withinLimit = true;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    if (j * j == i) {
                        divisorCount++;
                    } else {
                        divisorCount += 2;
                    }
                }
                if (divisorCount > limit) {
                    withinLimit = false;
                    break;
                }
            }
            if (withinLimit) {
                arr[i - 1] = divisorCount;
            } else {
                arr[i - 1] = power;
            }
        }

        int answer = 0;
        for (int i : arr) {
            answer += i;
        }

        return answer;
    }
}
