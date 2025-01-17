function solution(progresses, speeds) {
    
    var answer = speeds.map((item ,index) => {
        let i = (100-progresses[index]) / item ;
        return Math.ceil(i); 
    });
    
    let arr = [answer.shift()] ;
    let count = []; 
    
    for(let i of answer){
        if(arr[0] >= i){ 
            arr.push(i) ; 
        } 
        else {
            count.push(arr.length);
            arr.splice(0 , arr.length) ;
            arr.push(i); 
        }
    }
    
    if(arr.length) {
        count.push(arr.length) ; 
    }
  
   
    return count ;
}