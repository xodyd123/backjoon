function solution(s) {
    let strs = "" ; 
    for(let i of s) {
        for(const j of i){
            if(!/[a-z]/.test(j)) {
                strs += j.toLowerCase() ; 
            }
            else {
                strs += j ; 
            }
        }
    }
    
    strs = strs.split(" ");
    strs = strs.map(item => {
       
        item =  item.charAt(0).toUpperCase() + item.substring(1) + " ";
        return item ;
    })
      strs = strs.join("")
     return strs.substring(0 , strs.length-1) ;
}