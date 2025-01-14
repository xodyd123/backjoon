function solution(lottos, win_nums) {
    let max = lottos.reduce((item , cur) => cur === 0 ? item += 1 : item ,0); 
    let min = win_nums.reduce((item , cur) => {
        return lottos.includes(cur) ? item+= 1 : item ;
    } ,0)
  
    var answer = [obj[min+max] , obj[min]]; 
    
  
    return answer;
}

const obj = {
    0 : 6 , 
    1 : 6 , 
    2 : 5 ,
    3 : 4 , 
    4 : 3 , 
    5 : 2 , 
    6 : 1 
} ; 