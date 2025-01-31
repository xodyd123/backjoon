function solution(n, words) {
    var answer = [];
    for(let i = 0 ; i<words.length ; i++){
        let num = i%n ; 
        let strs = answer[answer.length-1] ?? words[0][0] ;  
       
        
        if(words[i].length === 1 || answer.indexOf(words[i]) !== -1 || strs.charAt(strs.length-1) !== words[i][0]){
           
            return [num+1 , Math.floor(answer.length/n)+1] ; 
        }
       
        
        answer.push(words[i]) ;
    }
 

    return [0,0];
}
    
