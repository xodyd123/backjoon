function solution(s) {
    const map = new Map(); 
    var arr = []; 
    const str = Array.from(s); 
    str.forEach(
        (item , index) => {
            if(!map.has(item)){
                arr.push(-1);
            }
            else {
                let num = map.get(item)
                arr.push(index -num) ; 
            }
            map.set(item , index); 
        }
    )
       return arr;
    
 }
 
