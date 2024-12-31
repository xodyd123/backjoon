function solution(s, n) {
    const str1 = "abcdefghijklmnopqrstuvwxyz";
    const str2 = str1.toUpperCase(); 
    let arr1 = str1.split(""); 
    let arr2 = str2.split("") ; 
    arr1 = [...arr1 , ...arr1] ;
    arr2= [...arr2 , ...arr2]; 
    var answer = '';
    
    for(const i of s){
        if(arr1.indexOf(i) !== -1) answer += arr1[arr1.indexOf(i)+n]; 
        
        else if(arr2.indexOf(i) !== -1) answer += arr2[arr2.indexOf(i)+n];
        
        else answer += i; 
    }
    
    
    

    return answer;
}