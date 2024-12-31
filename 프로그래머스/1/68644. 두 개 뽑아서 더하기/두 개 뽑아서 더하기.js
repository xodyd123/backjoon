function solution(numbers) {
    var answer = [];
    
    numbers.forEach((item1 ,index1 ,arr) => {
        arr.forEach((item2 ,index2) =>{
            index1 !== index2 ? answer = [...answer , item1+item2] : [...answer] ;  
        })
    });
    
    answer = [...new Set(answer)] 
    answer.sort((num1 , num2) => num1 > num2 ? 1 : -1); 
    return answer;
}