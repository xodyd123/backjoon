function solution(s) {
    result = s.match(/^\d+$/); 
    str = String(result?.[0]);
    if(str.length === 4 || str.length === 6){
        return true ;
    }
    return false ;
   
}