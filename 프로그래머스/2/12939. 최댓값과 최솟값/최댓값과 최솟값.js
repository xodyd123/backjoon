function solution(s) {
    let arr = s.split(" "); 
    arr.sort((item1 , item2) => Number(item1) > Number(item2) ? 1 : -1) ;
    
    var answer = arr[0] + " " + arr.pop(); 
    return answer;
}