function solution(N, stages) {
    var answer = [];
    let result = []; 
    stages.sort((item1 , item2) => item1>item2 ? 1 : -1) ;

    for(let i = 1 ; i<=N ; i++){
        let count = 0 ; 
        let length = stages.length ; 
        while(stages.includes(i)){
            stages.shift(); 
            count ++ ; 
        }
        
        answer[i-1] =  new stage(i , count/length)  
    }
   
   answer.sort((item1 , item2) => {
        if(item1.getNum() > item2.getNum()) {
            return -1 ; 
        }
       else if(item1.getNum() === item2.getNum()){
           if(item1.getIndex() > item2.getIndex()){
               return 1 ; 
           }
           else {
               return -1 ; 
           }
       }
       else {
           return 1 ; 
       }
   } );
   
   return answer.map((item) => item.getIndex())
    
}

function stage(index , num) {
    this.index = index ;
    this.num = num ; 
       
    stage.prototype.getIndex = function get(){
        return this.index ; 
    }
       
     stage.prototype.getNum = function get(){
        return this.num ; 
    }
       
    
    
    
}