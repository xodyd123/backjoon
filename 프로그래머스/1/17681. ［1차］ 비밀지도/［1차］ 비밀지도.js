function solution(n, arr1, arr2) {
    var answer = [];
    for(let i = 0 ; i<n ; i++){
        let num1 = Number(Number(arr1[i]).toString(2)) ;
        let num2 = Number(Number(arr2[i]).toString(2)) ;
       // console.log(num1+num2)
        let str = check(n , String(num1+num2)); 
        answer.push(str); 
    }
    answer = answer.map(item => item.replaceAll("2" , "#").replaceAll("1" , "#").replaceAll("0" , " "));
    return answer;
}

function check(n , str){
    let zero = "0" ; 
    let i = n - str.length ; 
    zero = zero.repeat(i) ;
    return zero + str ; 
}