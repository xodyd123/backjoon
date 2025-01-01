function solution(n, m) {
    
    // 최소 공약수 부터 
    let min = Math.min(n ,m) ; 
     
    var answer = [];
    
    for(min ; 0<min ; min--){
      
        if(n%min === 0 && m%min ===0) {
            answer.push(min) ;
            break}; 
    }
    
    let max = Math.max(n,m) ;
    
    while(true){
        if(max % n===0 && max%m ===0) {
            answer.push(max);
            break;
        }
        
        max++; 
    }
    
    
    return answer;
}