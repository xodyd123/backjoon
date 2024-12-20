function solution(n) {
     var answer = 0;
    for(let num = 2 ; num<=n ; num++){
         if(n % num === 1){
             answer = num ; 
             break;
         } 
    }

    return answer;
}