function solution(x, n) {
    var answer = [];
    for(let num = 0 ; num< n ; num++){
        answer.length === 0 ? answer.push(x) : answer.push(answer[answer.length-1]+x);
    }
    return answer;
}