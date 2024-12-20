function solution(a, b) {
    var answer = 0;
    
    
    let min , max ;
    min , max = a > b ?  (min = b , max = a) : (min = a , max = b) ; 
    
    for(min ; min<=max ; min++){
        answer += min ; 
    }
    return answer;
}
