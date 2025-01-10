function solution(n, m, section) {
    var answer = 1;
    let start = section.shift() ;
    while(section.length > 0){
        let check = start+m ;
        if(check>section[0]){
            section.shift();
            continue ; 
        }
        
        else {
            answer ++ ; 
            start = section.shift();
        }
    }
    return answer;
}