function solution(arr) {
    var answer = 0;
    arr.forEach(num => {answer += num;});
    
    answer = answer / arr.length ;
    return answer;
}