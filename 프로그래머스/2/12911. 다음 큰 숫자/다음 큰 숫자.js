function solution(n) {
    var answer = 0 ;
    let i = Number(n).toString(2) ;
    let count = [...i].reduce((item , cur) => cur === "1" ? ++item : item , 0);
    do{
        n += 1 ;
      
        let num = Number(n).toString(2) ;
        let compare = [...num].reduce((item , cur) => cur === "1" ? ++item : item , 0);

        if( compare === count) {
            answer = parseInt(num , 2); 
            break ; 
        }
        
        
        
    }while(true) ;
   
    return answer;
}

