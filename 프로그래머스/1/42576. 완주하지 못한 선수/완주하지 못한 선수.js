function solution(participant, completion) {
    var answer = '';
    for(let num of completion){
        obj[num] ? obj[num] = obj[num]+1 : obj[num] = 1  ;
       
    }
    
    for(let i of participant){
        if(!obj[i]) return i ; 
        
        obj[i] = obj[i] -1 ; 
    }
    
    console.log(obj); 
    return answer;
}

let obj = {
    
} ; 