# 6236
# Siver II
from sys import stdin
N, M = map(int, stdin.readline().split())

arr = [int(stdin.readline()) for _ in range(N)]

left = max(arr)
right = sum(arr)
answer = left
while left <= right:
    mid = (left + right) // 2

    count = 1
    balance = mid

    for a in arr:
        if balance < a:
            count += 1
            balance = mid - a
        else:
            balance -= a

    if count > M:
        left = mid + 1
    else:
        right = mid - 1
        answer = mid
    
print(answer)
    