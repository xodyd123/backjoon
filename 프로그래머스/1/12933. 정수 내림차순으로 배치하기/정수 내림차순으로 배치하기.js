function solution(n) {
    let answer =""
    str = String(n) ; 
    const arr = Array.from(str , num => Number(num)); 
    for (let i = 9; i >= 0; i--) {
    let index = arr.indexOf(i); // 값의 인덱스를 찾음
    while (index !== -1) {
        answer += String(i); // 문자열로 추가
        arr.splice(index, 1); // 해당 요소 제거
        index = arr.indexOf(i); // 다음 인덱스 찾기
    }
}

    return Number(answer);
}

