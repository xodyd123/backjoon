def solution(number):
    my_list =[]
    count = 0
    for k in range(len(number)-2) :
        for s in range(k+1, len(number)-1) :
            for t in range(s+1, len(number)) :
                num = (number[k] , number[s] , number[t])
                if sum(num) == 0:
                    count += 1
    return count 