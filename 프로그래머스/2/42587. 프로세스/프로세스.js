function solution(priorities, location) {
    var answer = 0;
    const newArr = priorities.map((item , index) => {
        return {
            index , 
            item 
        }
    });  
    priorities.sort((a,b) => b-a) ;
    let result = [] ; 
    let num = 0 ; 
  
    while(priorities.length != 0){
        let p = priorities.shift(); 
        let n = newArr.shift() ; 
        if(p === n.item){
            
            result.push(n.index); 
            
        }
        else if(n.item !== p){
            newArr.push(n) ;
            priorities.unshift(p) ; 
                   
        }                         
      
    } 
    

      
    for(let i = 0 ; i<result.length ; i++){
        if(result[i] === location){
            return i+1 ; 
        }
    }
    return 1;
}