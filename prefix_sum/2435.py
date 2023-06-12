# 2435.py
# Bronze I

N, K = map(int, input().split())

arr = list(map(int, input().split()))

total = sum(arr[:K])
m = total

for i in range(K, N):
    total += arr[i] - arr[i - K]
    m = max(total, m)

print(m)
    

