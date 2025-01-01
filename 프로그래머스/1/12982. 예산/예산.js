function solution(d, budget) {
    var answer = d.length;
    let sort = d.sort((item1 , item2) => item1>item2 ? 1: -1) ;

    
    let sum = sort.reduce((item ,current) => item+current  ,0);
    let slice = d 
    while(sum > budget){
       slice = sort.slice(0,answer) ;
       sum = slice.reduce((item ,current) => item+current  ,0);
       answer -- ; 
    }
    console.log(slice); 
   
    return slice.length;
}