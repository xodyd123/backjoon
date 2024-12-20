function solution(arr) {
    //1. 가장 작은 수 확인 => 2. 배열에서 가장 작은수 인덱스 확인 => 3. 인덱스 제거 => 빈 배열일때 -1 추가  
    let min = Math.min(...arr); 
    
    let answer = arr.filter(num => {
       return num !== min 
    });
    if(answer.length === 0){
        answer.push(-1);
        return answer ; 
    }
    
    return answer ; 
    
    
}