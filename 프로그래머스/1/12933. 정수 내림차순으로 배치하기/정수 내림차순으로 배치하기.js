function solution(n) {
    var answer = 0;
    const str = [...String(n)];
    
    let results = str.map(item => Number(item));
    results = results.sort((item1 , item2) => item2 - item1) ; 
    results = results.reduce((first , cur) => first + cur ,"")
    return Number(results); 
}