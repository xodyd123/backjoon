function solution(babbling) {
    var answer = []; 
    for(let i of babbling){
        while(i.includes("aya")||i.includes("ye")||i.includes("woo")||i.includes("ma")){
            if(i.includes("aya")){
                i = i.replace("aya" , "1");
            } else if(i.includes("ye")){
                i = i.replace("ye" , "2") ; 
            }else if(i.includes("woo")){
                i = i.replace("woo" , "3") ; 
            }else if(i.includes("ma")){
                i = i.replace("ma" , "4") ; 
            }
        }
       
        if(/^\d+$/.test(i)){
            answer.push(i); 
        }
         
    }

    answer = answer.filter(item => {
        if(item.includes("11") || item.includes("22") || item.includes("33") || item.includes("44")){
            return false ;
        }
        return true ;
    })
   
    return answer.length;
}