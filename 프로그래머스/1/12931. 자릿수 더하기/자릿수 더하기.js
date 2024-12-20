function solution(n){
    var answer = 0;
    const str = String(n);
   
    for(const num of str){
        answer += parseInt(num);
    }

    return answer;
}