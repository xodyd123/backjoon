function solution(absolutes, signs) {
  
    const answer = absolutes.reduce((inital , current  , index) => {
    
        return signs[index] ? inital+current : inital-current ; 
    } , 0);
    return answer;
}