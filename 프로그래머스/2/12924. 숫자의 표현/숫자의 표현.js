function solution(n) {
    var answer = 0;
    let k = Math.floor(n/2);
    for(let i = 1 ; i<= k ; i++){
        answer += !!check(n , i);  
        
   }
    return answer +1 ;
}

function check(n , start) {
    
    let num = 0 ; 
    
    while(num < n){
        num += start ;
        start ++ ; 
    } 
    
    return num === n 
}