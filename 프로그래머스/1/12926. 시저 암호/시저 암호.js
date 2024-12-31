function solution(s, n) {
    let str1 = "abcdefghijklmnopqrstuvwxyz";
    let str2 = str1.toUpperCase(); 
    str1 += str1 ;
    str2 += str2 ; 
  
    var answer = '';
    
    for(const i of s){
        if(str1.indexOf(i) !== -1) answer += str1[str1.indexOf(i)+n]; 
        
        else if(str2.indexOf(i) !== -1) answer += str2[str2.indexOf(i)+n];
        
        else answer += i; 
    }
    
    
    

    return answer;
}