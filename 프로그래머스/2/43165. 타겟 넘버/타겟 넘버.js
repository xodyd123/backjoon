let count = 0 ; 

function solution(numbers, target) {
    var answer = 0;
    
    dfs(answer , 0 , numbers.length , numbers , target ,count) ;
    
 
    return count ; 
    
    
}


function dfs(answer , start , end , numbers , target){
    if(start === end) {
      
        if(answer === target) {
            count ++ ;
        }
        return ; 
        
    } 
    
    start ++ ; 
    
    dfs(answer+numbers[start-1] , start , end , numbers , target) ; 
    
    dfs(answer-numbers[start-1] , start , end , numbers , target) ; 
    
}