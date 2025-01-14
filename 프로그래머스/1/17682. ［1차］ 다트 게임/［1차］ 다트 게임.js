function solution(dartResult) {
    dartResult =  dartResult.replaceAll("10" , "z") ; 
  
    
    let obj = func(); 
    for(let num of dartResult){
        if(num === "z"){
            obj.set(Number(10)); 
        }
        
        else if(isNaN(num)) {
            obj.circulate(num) ;
        } 
        else {
            obj.set(Number(num));
        }
    }
    return obj.get().reduce((item , cur) => item+cur , 0);
}
    
function func(){
    let arr = [] ;
    
    function f(){
        
    } ;
    
    f.circulate = function(type){
        switch (type) {
                case "D" : arr[arr.length-1] = arr[arr.length-1] ** 2 ; 
                break ;
                
                case "T" : arr[arr.length-1] = arr[arr.length-1] ** 3 ; 
                break ;
                
                case "#" : arr[arr.length-1] = arr[arr.length-1] * -1 ; 
                break ;
                
                case "*" : arr[arr.length-1] = arr[arr.length-1] * 2 ;
                           arr[arr.length-2] = arr[arr.length-2] * 2  ;
                break ;
        }
    }
    
    f.get = function(){

        return arr ; 
    }
    
     f.set = function(num){
        arr[arr.length] = num   
    }
    
    return f ; 
    
}

