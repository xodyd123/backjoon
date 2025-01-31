function solution(want, number, discount) {
    var answer = 0;
    for(let i = 0 ; i<want.length ; i++){
        obj[want[i]] = number[i] ; 
    }
    let sum = number.reduce((item , cur) => item + cur) ;
    for(let i = 0 ; i<=discount.length - sum ; i++){
        let newObj = Object.assign({} ,obj) ; 
 
        let slice = discount.slice(i , sum+i) ;
        for(let str of slice){ 
            newObj[str] = newObj[str] -1 ;  
        }      
        let set = new Set(Object.values(newObj)) ;
       ;
        if(set.size === 1 && set.has(0)){
            answer ++ ; 
        }
    } 
   
    return answer;
}


let obj =  {
    
    
   
}