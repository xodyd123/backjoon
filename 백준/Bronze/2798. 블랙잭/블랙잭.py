N, M = map(int, input().split())
card_list = list(map(int, input().split()))

max_sum = 0  # 최대 합을 저장할 변수 초기화

for i in range(0, N-2):
    for j in range(i+1, N-1):
        for k in range(j+1, N):
            current_sum = card_list[i] + card_list[j] + card_list[k]  # 현재 세 카드의 합 계산
            if current_sum <= M and current_sum > max_sum:  # 합이 M을 넘지 않고 최대 합보다 큰 경우
                max_sum = current_sum  # 최대 합 업데이트

print(max_sum)