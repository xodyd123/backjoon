function solution(price, money, count) {
    let arr = new Array(count);
    arr.fill(price); 
    
    const newArr = arr.map((num , index) => num*(index+1)) ;
    
    const sum = newArr.reduce((num , curent) => num+curent , 0);
  
    
   
    return sum>money ? sum-money : 0; 
}

