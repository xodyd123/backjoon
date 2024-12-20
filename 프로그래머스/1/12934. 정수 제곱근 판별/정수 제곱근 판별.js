function solution(n) {
    var answer = 0;
    for(let num = 1 ; num<= n ; num++){
        if(check(num , n)){
            answer = num ; 
            break ; 
        }
    }
    
    return answer === 0 ? -1 : (answer+1)*(answer+1) ;
}

function check(num , n){
    if(num*num === n){
        
        return true ;
    }
    
    return false ; 
}