# 1654
# Silver II
import sys
K, N = map(int, input().split())

arr = []
for i in range(K):
    arr.append(int(input()))

start, end = 1, max(arr)

while start <= end:
    mid = (start + end) // 2
    count = 0
    for l in arr:
        count += l // mid

    if count >= N:
        start = mid + 1
    else:
        end = mid - 1

print(end)
            
