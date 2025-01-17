function solution(s){
    
    let arr = [] ; 
    
    for(let i of s){
        arr[arr.length-1] === i ? arr.pop() : arr.push(i); 
    }
    
    
    return arr.length ? 0 : 1;
}