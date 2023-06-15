# 2015
# Gold II

from sys import stdin
N, K = map(int, stdin.readline().split())

arr = list(map(int, stdin.readline().split()))

prefix_sum = [0] * N
prefix_sum[0] = arr[0]

for i in range(1, N):
    prefix_sum[i] = prefix_sum[i - 1] + arr[i]
    
answer = 0

count = {0: 1}

for s in prefix_sum:
    answer += count.get(s- K, 0)
    count[s] = count.get(s, 0) + 1


print(answer)
   