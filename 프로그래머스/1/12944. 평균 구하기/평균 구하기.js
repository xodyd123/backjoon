function solution(arr) {
    var answer = 0;
    answer = arr.reduce((start , current , index , {length}) => {
       return index === length-1 ? (start + current) / length : start+current ;
    })
    
    return answer;
}