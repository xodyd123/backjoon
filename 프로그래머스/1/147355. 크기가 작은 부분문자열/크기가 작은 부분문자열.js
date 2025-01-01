function solution(t, p) {
    let len = p.length
    var answer = 0;
    for(let i = 0 ; i<t.length ; i++){
        let str = t.substring(i , i+len);
        str.length === len ? Number(str) <= Number(p) ? answer ++ : answer  : str ;
      
    }
    

    return answer;
}