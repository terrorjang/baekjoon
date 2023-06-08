# 2231
# Bronze II

def sum_each(n):
    res = n
    while n > 0:
        res += n % 10
        n = n // 10
    
    return res

    
N = int(input())

ans = 0
start = N// 10
for i in range(start, N):
    if sum_each(i) == N:
        ans = i
        break
    

print(ans)
    
    