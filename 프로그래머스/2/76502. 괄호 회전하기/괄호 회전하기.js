function solution(s) {
    let answer = 0 ; 
    let arr = Array.from(s) ; 
    for(let x = 0 ; x<s.length ; x++){

        answer += check([...arr] ,s.length) ; 
        let splice = arr.splice(0 , 1) ; 
        //console.log(splice) ;
        arr.push(...splice) ; 
        
    }
  
    return answer;
}

function check(arr ,s){ 
    let newArr = [] ;   
    for(let i = 0 ; i<s ; i++){
        let shift = arr.shift(); 
        if(shift === "[" || shift === "{" || shift === "(" ) {
            newArr.push(shift) ; 
        }
        else if(shift === "]" ) {
            let str = newArr.pop() ;
            if(str !== "[") {
                return false ; 
            } 
        }
          else if(shift === "}" ) {
            let str = newArr.pop() ;
            if(str !== "{") {
                return false ; 
            } 
        }
           else if(shift === ")" ) {
            let str = newArr.pop() ;
            if(str !== "(") {
                return false ; 
            } 
        }
                
    }
    //console.log(newArr) ; 
    return newArr.length === 0 ? true : false ;  
    
}