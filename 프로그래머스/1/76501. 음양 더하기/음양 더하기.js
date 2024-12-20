function solution(absolutes, signs) {
    var answer = 0
    const arr = absolutes.map((arr , index) => {
        return signs[index] ? arr : -arr ;  
    } );
    arr.forEach(arr => answer += arr);
    return answer;
}