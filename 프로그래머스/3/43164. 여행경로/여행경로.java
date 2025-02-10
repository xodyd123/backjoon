import java.util.*;

class Solution {
    private Map<String, PriorityQueue<String>> graph = new HashMap<>();
    private List<String> result = new ArrayList<>();

    public String[] solution(String[][] tickets) {
        // 그래프 초기화 (사전순 탐색을 위해 PriorityQueue 사용)
        for (String[] ticket : tickets) {
            graph.putIfAbsent(ticket[0], new PriorityQueue<>());
            graph.get(ticket[0]).add(ticket[1]);
        }

        // DFS 실행
        dfs("ICN");

        // 결과를 역순으로 변환
        Collections.reverse(result);
        return result.toArray(new String[0]);
    }

    private void dfs(String airport) {
        // 사전순으로 탐색하기 위해 우선순위 큐 사용
        while (graph.containsKey(airport) && !graph.get(airport).isEmpty()) {
            dfs(graph.get(airport).poll());
        }
        // 역순으로 경로 추가
        result.add(airport);
    }
}


