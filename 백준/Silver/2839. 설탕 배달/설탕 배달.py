N = int(input())  
a = N // 5 
b = 0 
my_list =[]
for s in range(a,-1,-1) :
    num = False 
    for t in range(b,N//3 +1) :
        if 5 * s + 3 * t == N :
            my_list.append(s+t)
            num = True 
            break 

        elif 5 * s + 3 * t != N :
            num = False 
    if num == True :
        break
if num :
    print(min(my_list)) 
else :
    print(-1)