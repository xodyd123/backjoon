function solution(numbers) {
    let set = new Set([0,1,2,3,4,5,6,7,8,9]); 
    let answer = 0;
    for(const num of set){
        if(numbers.indexOf(num) === -1){
            answer += num ; 
        }
    }
    return answer;
}