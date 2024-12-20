function solution(s){
    var answer =count(s);
    return answer;
}

function count(s){
    let p = 0
    let y = 0 
    for(let num of s){
      if(num === "p" || num === "P"){
          p++ ; 
      }
      else if(num === "y" || num === "Y")
          y++ ; 
    }
    return p === y ? true : false  
}