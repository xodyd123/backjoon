function solution(a, b) {
  return a.reduce((sum , current , index) => 
         sum += current * b[index] 
  
    ,0);
    
}