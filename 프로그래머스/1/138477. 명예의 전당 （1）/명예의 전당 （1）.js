function solution(k, score) {    
    var answer = [];
    var result = []; 
    
    for(const num of score){
        if(answer.length < k) {
            answer.push(num); 
        }
        else {
            if(answer[answer.length-1] < num){
                answer.pop();
                answer.push(num); 
            }
        }
        
        answer = answer.sort((num1 , num2) => num2>num1 ? 1 : -1);
        result.push(answer[answer.length-1]);
        
    }
    return result;
}