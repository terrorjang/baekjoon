# 1932
# Silver I

n = int(input())

arr = [list(map(int, input().split())) for _ in range(n)]
# dp = arr.copy()
dp = [[0] * n for _ in range(n)]
dp[0][0] = arr[0][0]

for ri in range(1, n):
    for ci in range(len(arr[ri])):
        if ci == 0:
            dp[ri][ci] = dp[ri - 1][ci] + arr[ri][ci]
        else:
            dp[ri][ci] = max(dp[ri - 1][ci], dp[ri - 1][ci - 1]) + arr[ri][ci]
    
print(max(dp[-1]))