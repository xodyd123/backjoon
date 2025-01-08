function solution(answers) {
    const arr1 = [1,2,3,4,5]; 
    const arr2 = [2,1,2,3,2,4,2,5];
    const arr3 = [3,3,1,1,2,2,4,4,5,5]; 
    var answer = [arr1 , arr2 ,arr3];;
    let result = []
    for(const num of answer){
        result.push(check(answers , num))
    }
    let max = Math.max(...result);
    result =  result.map((item , index) => {
        if(item === max) return index+1 ; 
    }); 
    
    return result.filter(item => {
        return item !== undefined}); 
}

function check(answers , arr){
    let len = arr.length ; 
    return answers.filter((item ,index) => item === arr[index%len]).length ; 
}