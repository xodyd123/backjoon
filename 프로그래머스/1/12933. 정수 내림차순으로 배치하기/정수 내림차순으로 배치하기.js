function solution(n) {
    let answer =""
    str = String(n) ; 
    const arr = Array.from(str , num => Number(num));
    arr.sort((a1 ,a2) => a2-a1>0 ? 1: -1); 
    console.log(arr)
    arr.forEach(num => answer += num); 
    return Number(answer);
}

