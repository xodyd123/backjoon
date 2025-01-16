function solution(s) {
   
    let arr = [0,0] ;
    while(s !=="1"){
        arr[0] = arr[0] + 1 ;
        let zero = s.replaceAll("0" ,"");
      
        let count = s.length - zero.length 
        arr[1] = arr[1] + count  ; 
        s = Number(zero.length).toString(2);  
     
   
    }
    
  
    var answer = [];
    return arr;
}