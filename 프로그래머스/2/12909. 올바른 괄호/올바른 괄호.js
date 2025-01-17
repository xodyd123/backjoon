function solution(s){
    let arr = [] ; 
    
    if(!s.includes("(") || !s.includes(")")) return false ; 
    
    for(const i of s){
       if(i === "(") {
        arr.push(i) ;    
       }
        
       else{
           if(!arr.pop()) return false ; 
       }
    }
   
    return arr.length === 0 ;
}