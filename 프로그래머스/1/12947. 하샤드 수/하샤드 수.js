function solution(x) {
    const str = String(x);  
    const int = [...str].reduce((first , cur) => first+ Number(cur) , 0) ;
    
  
  
    return x%int === 0 ? true : false ; 
}