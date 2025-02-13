import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1); // 기본값 -1
        Stack<Integer> stack = new Stack<>(); // 인덱스를 저장할 스택

        for (int i = 0; i < numbers.length; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
                answer[stack.pop()] = numbers[i]; // 더 큰 수를 발견하면 정답 배열 갱신
            }
            stack.push(i); // 현재 인덱스 저장
        }
        return answer;
    }
}