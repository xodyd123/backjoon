function solution(cards1, cards2, goal) {
    let bol = true ; 
    for(const str of goal){
        if(cards1.indexOf(str) === 0){
            cards1.shift();
        }
        else if(cards2.indexOf(str) === 0){
            cards2.shift(); 
        }
        else {
            bol = false  ; 
            break ; 
        }
    } 
    return bol ? "Yes" : "No" ;  
}