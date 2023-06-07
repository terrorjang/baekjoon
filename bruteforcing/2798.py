# 2798
# bronze

N, M = map(int, input().split())

cards = list(map(int, input().split()))

ans = 0
for i in range(N - 2):
    for j in range(i + 1, N - 1):
        for k in range(j + 1, N):
            temp = cards[i] +  cards[j] + cards[k]
            if temp > M:
                continue
            
            ans = max(ans, temp)


print(ans)
            