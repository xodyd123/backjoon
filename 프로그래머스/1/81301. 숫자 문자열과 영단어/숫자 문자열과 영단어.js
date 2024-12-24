function solution(s) {
    const zero = /zero/g ; 
    const one = /one/g ; 
    const two = /two/g ; 
    const three = /three/g ; 
    const four = /four/g ; 
    const five = /five/g ; 
    const six = /six/g ; 
    const seven = /seven/g ; 
    const eight = /eight/g ; 
    const nine = /nine/g ; 
    
    const arr=[zero , one , two , three ,four ,five ,six ,seven , eight , nine]; 
    
    arr.forEach((num , index) => {
      
        s= s.replace(num , index); 
    });
    return Number(s) ; 
}