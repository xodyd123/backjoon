function solution(array, n) {
    var answer = 100 ;
    console.log(array.sort((a,b) => a-b) );
    let result = 0 ; 
    for(let num of array){
        let min = Math.abs(num - n) ;
        if(answer > min){
            answer = min ; 
            result = num ;
        }
    }
    return result;
}