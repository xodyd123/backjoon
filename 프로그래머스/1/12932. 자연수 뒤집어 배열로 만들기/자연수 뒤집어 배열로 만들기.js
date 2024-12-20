function solution(n) {
    var str = String(n); 
    var answer = Array.from(str , num => Number(num));
    answer.reverse(); 
    return answer;
}