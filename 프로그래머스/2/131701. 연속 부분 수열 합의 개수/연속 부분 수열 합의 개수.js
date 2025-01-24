function solution(elements) {
    var answer = 0;
    let one = new Set(elements).size ; 
    let length = elements.length ; 
    let arr = []; 
    for(let i = 0 ; i<length-1 ; i++){
        let slice = elements.slice(0,i);
 
        arr = [...arr , ...circulate([...elements , ...slice] , i+1 ,length)]; 
       
      
    }
    
    return new Set(arr).size +1 ;
}

function circulate(elements , i , length) {
    
    let arr = [] ;
    for(let j = 0 ; j<length  ; j++){
 
       let slice = elements.slice(j , j+i) ;  
       let sum = slice.reduce((item , cur) => item += cur ,0 ) ;
       arr.push(sum) ; 
       
    }
    return new Set(arr) ; 
}