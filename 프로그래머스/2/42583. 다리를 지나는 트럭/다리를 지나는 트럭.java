import java.util.*;

class Solution {
    static class Truck {
        int weight, position;

        public Truck(int weight) {
            this.weight = weight;
            this.position = 0;
        }

        public Truck(int weight, int position) {
            this.weight = weight;
            this.position = position;
        }
    }
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0; // 경과 시간
        int bridgeWeight = 0; // 현재 다리 위의 트럭 총 무게
        Queue<Truck> bridge = new LinkedList<>(); // 다리 위의 트럭 큐
        int idx = 0; // 대기 트럭 인덱스

        while (idx < truck_weights.length || !bridge.isEmpty()) {
            time++;

            if (!bridge.isEmpty()) {
                Truck frontTruck = bridge.peek(); // 맨 앞의 트럭
                if (time - frontTruck.position >= bridge_length) { // 다리를 다 건넜을 경우
                    bridgeWeight -= frontTruck.weight; // 다리 무게에서 제외
                    bridge.poll(); // 트럭 다리에서 내림
                }
            }

            if (idx < truck_weights.length) {
                if (bridgeWeight + truck_weights[idx] <= weight && bridge.size() < bridge_length) {
                    bridge.add(new Truck(truck_weights[idx], time)); // 트럭 다리에 올림
                    bridgeWeight += truck_weights[idx]; // 현재 다리 무게 갱신
                    idx++; // 대기 트럭 인덱스 증가
                }
            }
        }
        return time;
    }
}