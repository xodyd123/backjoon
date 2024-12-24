function solution(array, commands) {
    var answer = [];
    for(const num of commands){
        let result = check(array , num); 
        answer.push(result); 
    }
    return answer;
}


function check(array , num){
  
    let [num1 , num2 , num3] = num ; 
    
    let num4 ; 
    
    num1 > num2 ? (num4 = num1 , num1 = num2 , num2 = num4) : num1 ;  
    
    let newArr = array.slice(num1-1 , num2).sort((result1 , result2) => result1 > result2 ? 1 : -1  ); 
 
    return newArr[num3-1] ; 
}