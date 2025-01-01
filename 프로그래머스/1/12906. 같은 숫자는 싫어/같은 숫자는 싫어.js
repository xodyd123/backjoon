function solution(arr){
    
    const answer = [] ;
    
    for(const result of arr){
        answer[answer.length-1] !== result ? answer.push(result) : answer ;
    }
    
    return answer ;
}