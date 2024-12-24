function solution(strings, n) {
    var answer = [];
    answer = strings.sort()

    const result = answer.sort((a1 ,a2) => {
        if(a1.charAt(n) !== a2.charAt(n)){
            if(a1.charAt(n) > a2.charAt(n)){
                return 1 ; 
            }
            else{
                return -1 ; 
            }
        }
        return 0 ; 
        
    })
                             
                             
    return result;
}