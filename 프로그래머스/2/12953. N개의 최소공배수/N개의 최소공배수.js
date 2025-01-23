function solution(arr) {
    let max = Math.max(...arr) ; 
    
    
    while(true){
        let newArr = arr.filter(item => max%item !== 0) ;
        
        
        
        if(newArr.length === 0) break  ;
        
        max ++ ; 
        
    }

    return max ;
}