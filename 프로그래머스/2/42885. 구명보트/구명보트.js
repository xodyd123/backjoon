function solution(people, limit) {
    // 몸무게 배열을 내림차순 정렬
    people.sort((a, b) => b - a);

    let answer = 0;
    let left = 0; // 가장 가벼운 사람의 인덱스
    let right = people.length - 1; // 가장 무거운 사람의 인덱스

    while (left <= right) {
        // 가장 무거운 사람과 가장 가벼운 사람의 조합 확인
        if (people[left] + people[right] <= limit) {
            right--; // 가장 가벼운 사람 구출
        }
        left++; // 가장 무거운 사람 구출
        answer++; // 보트 사용
    }

    return answer;
}
