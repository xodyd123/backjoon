function solution(numbers, target) {
    let queue = [0]; // 시작점은 0
    for (let num of numbers) {
        let nextQueue = [];
        for (let current of queue) {
            nextQueue.push(current + num); // 더하기 경우
            nextQueue.push(current - num); // 빼기 경우
        }
        queue = nextQueue; // 다음 단계로 이동
    }

    // 최종 결과 중 target과 같은 값의 개수를 세기
    return queue.filter((value) => value === target).length;
}