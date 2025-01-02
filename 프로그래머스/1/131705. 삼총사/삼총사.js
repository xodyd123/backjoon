function solution(number) {
    var answer = 0;
    for(let i = 0 ; i<number.length-2 ; i++){
        for(let j = i+1 ; j<number.length-1 ; j++){
            for(let k = j+1 ; k<number.length ; k++){
               let arr =[number[i] , number[j] , number[k]]; 
               let sum = arr.reduce((item , cur) => item+cur , 0) ;
               sum === 0 ? answer++ : answer ;  
            }
        }
    }
    return answer;
}