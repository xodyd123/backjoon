function solution(n) {
    let str = n.toString(3).split("").reverse().join("")
    let arr = Array.from(str) ;
   
    let result = 0 ; 
    
    arr.forEach((item , index) => {
    
        result += item * 3**(arr.length - index -1); 
    }) 
    
    
    return result ;
}