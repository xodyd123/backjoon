function solution(absolutes, signs) {
  
    const answer = absolutes.reduce((inital , current  , index) => 
    
         signs[index] ? inital+current : inital-current 
     , 0);
    return answer;
}