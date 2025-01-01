function solution(s) {
    var answer = '';
    var arr = [...s] ;
    var newArr = [] ; 
    while(arr.indexOf(" ") !== -1){
        let index = arr.indexOf(" ");
        let str = arr.splice(0 , index+1) ; 
        
        newArr.push(str); 
    }
    
    newArr.push(arr); 
    
   const result =  newArr.reduce((item , cur) => {
 
        return [...item,...check(cur)]}
                 ,[]);
    
    return result.join("") ;
}

function check(arr){
    
    return arr.map((item , index) => index%2 === 0? item.toUpperCase() : item.toLowerCase()); 
}