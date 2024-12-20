function solution(s) {
    const range = s.length/2
    let length = s.length % 2 === 0 ? s.substring(range-1 , range+1) : s.substring(range , range+1);  
    
    return length;
}