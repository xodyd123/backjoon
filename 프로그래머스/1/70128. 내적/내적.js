function solution(a, b) {
    var answer = a.reduce((sum , current , index) => {
         sum += current * b[index] ;
         return sum ;}
    ,0)
    return answer;
}