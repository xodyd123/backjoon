function solution(citations) {
    citations.sort((a,b) => b > a ? 1 : -1) ; 
   
    let max = citations[0] ; 
    for(max ; max>=0 ; max--){
       let arr =  citations.filter((item) => item >= max) ;
       if(arr.length >= max) return max ; 
    }
   
}

