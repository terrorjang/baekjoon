# 2579
# Silver III

n = int(input())
arr= [int(input()) for _ in range(n)] + [0, 0]
dp = [0] * (n + 2)

dp[0] = arr[0]
dp[1] = arr[0] + arr[1]
dp[2] = max(arr[1]+ arr[2], arr[0]+ arr[2])


for i in range(3, n):
    dp[i] = max(dp[i-2], dp[i-3] + arr[i -1]) + arr[i]

print(dp[n-1])



