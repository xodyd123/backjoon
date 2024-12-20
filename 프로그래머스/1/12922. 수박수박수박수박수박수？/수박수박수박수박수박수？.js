
function solution(n) {
    var answer = '';
    for(let i=1;i<=n/2; i++){
        answer = answer + '수박'
    }
    n%2==1? answer = answer + '수' : answer;
    return answer;
}
