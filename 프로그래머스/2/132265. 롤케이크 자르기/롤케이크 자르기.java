import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> leftSet = new HashSet<>();
        Map<Integer, Integer> rightMap = new HashMap<>();

        // 1. rightMap을 먼저 채워놓기 (각 토핑 개수 저장)
        for (int t : topping) {
            rightMap.put(t, rightMap.getOrDefault(t, 0) + 1);
        }

        // 2. 하나씩 왼쪽으로 이동하면서 비교
        for (int t : topping) {
            leftSet.add(t); // 왼쪽에 추가
            rightMap.put(t, rightMap.get(t) - 1); // 오른쪽에서 하나 제거
            
            if (rightMap.get(t) == 0) {
                rightMap.remove(t); // 해당 토핑이 없으면 제거
            }

            // 왼쪽과 오른쪽의 토핑 종류 개수가 같으면 증가
            if (leftSet.size() == rightMap.size()) {
                answer++;
            }
        }

        return answer;
    }
}
