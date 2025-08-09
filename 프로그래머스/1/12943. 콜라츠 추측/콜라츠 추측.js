function solution(num) {
    var answer = 0;
 
    class Obj{
        
        constructor(num){
            this.num = num ;  
            this.count = 0
        } 
        
   
        circulate = () => {
            let result = 500; 
            while(result > 0){
             
                if(this.num === 1){
                    break; 
                }
                result -- ;
                
                if(this.num %2 === 0){
                   this.num = this.num /2 ;
                    this.count ++ ;
                }
                else{
                     this.num = this.num * 3 +1 
                     this.count ++ ;
                }
              
            }
        }
    } 
    const obj = new Obj(num) ;
    obj.circulate() ;
    return obj.count === 500 ? -1 : obj.count ; 
}