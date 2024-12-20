function solution(arr1, arr2) {

    const answer = arr1.map((_, index) => {
        return circulate(arr1[index] ,arr2[index]);
    }
           )
    return answer;
}

function circulate(arr1 , arr2){
    const newArr = new Array(arr1.length); 
    arr1.forEach((_ , index) => newArr[index] = arr1[index]+arr2[index]);
    return newArr ; 
    
}