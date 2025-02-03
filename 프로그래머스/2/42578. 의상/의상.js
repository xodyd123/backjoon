function solution(clothes) {
    for(let i of clothes){
        let [value , key] = i ;   
        obj[key] ? obj[key].add(value) : obj[key] = new Set([value]) ;
    }
    let objects = Object.keys(obj); 

    if(objects.length > 1){
        return Object.values(obj).reduce((item , cur) => item *= (cur.size +1)  , 1) -1  
    }
    let [set] =  Object.values(obj) ; 
    return set.size;
}
const obj = {
    
} ;