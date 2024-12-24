function solution(food) { 
    const arr = []
   for(let num = 1 ; num<food.length ; num++){
       let put = Math.floor(food[num]/2);
       
       putArr(num , put , arr) ;
      
   }
    const newArr = [...arr , 0 , ...arr.reverse()]; 
    return newArr.join("");
}

function putArr(num , put , arr){
    for(let i = 0 ; i<put ; i++){
        arr.push(num); 
    }
}
