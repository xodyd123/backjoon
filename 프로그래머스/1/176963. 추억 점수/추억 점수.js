const picture = {
    
}

function solution(name, yearning, photo) {
    var answer = [];
    for(let i = 0 ; i<name.length ; i++){
       picture[name[i]] = yearning[i] ; 
    }
   
    
    for(let i = 0 ; i<photo.length ; i++){
        let num = 0 ;
        for(let j = 0 ; j<photo[i].length ; j++){
            let obj = photo[i][j];
            if(picture[obj]) num += picture[obj];
        }
        answer.push(num);
    }
    return answer;
}



