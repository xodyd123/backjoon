function solution(nums) {
    const count = [...new Set(nums)];
    
    
    
    console.log(count); 
    var answer = 0;
    
    return nums.length/2<count.length ? nums.length/2 : count.length ; 
}