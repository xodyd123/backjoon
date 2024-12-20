function solution(phone_number) {
    let length = phone_number.length - 4 ;
    const str = "*"
    let result = str.repeat(length);
    let sub = phone_number.substring(length);
    result += sub ;
 
    return result;
}