function solution(a, b, n) {
    var result = 0 
    var answer = 0;
    while(n>=a){
        answer = Math.floor(n / a) * b ;
        n = n - (Math.floor(n/a) * a) + answer   ; 
        result += answer ; 
        
    }
    return result;
}
