function solution(numbers) { 
    numbers.sort((a,b) =>  func(a,b) ); 
        
    
    return numbers.join("").replace(/^0+/ , "0");
}

function func(a,b) {
    let num1 = String(a)+String(b) ; 
    
    let num2 = String(b)+String(a) ;
    
    if(Number(num2) > Number(num1)) {
        return 1 ; 
    }
    
    return -1 ; 
}