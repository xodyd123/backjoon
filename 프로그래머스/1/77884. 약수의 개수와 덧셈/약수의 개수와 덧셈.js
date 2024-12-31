function solution(left, right) {
    var answer = []; 
    for(left ; left<=right ; left++){
        let count = 0 ; 
        for(let i = 1 ; i<=left ; i++){
            if(left % i ==0) count ++ ; 
        }
        count % 2 === 0 ? answer.push(left) : answer.push(-left);  
    }
    
    let sum = answer.reduce((i , c) => i+c , 0); 

    return sum;
}