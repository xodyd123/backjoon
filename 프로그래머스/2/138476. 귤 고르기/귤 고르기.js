function solution(k, tangerine) {
    let max = Math.max(...tangerine) ; 
    let arr = new Array(max+1) ;
    arr.fill(0) ; 
    for(const i of tangerine){
        arr[i] = arr[i] +1  ;  
    }
   
    arr = arr.map((item , index) => [index , item])

    arr.sort((item1 , item2) => item1[1] < item2[1] ? 1 : -1); 
    
    var answer = 0;
    for(const i of arr){
        if(k<=0){
            break ;
        }
        k -= i[1] ;
        answer ++ ; 
        
    }
    
    
    return answer;
}

