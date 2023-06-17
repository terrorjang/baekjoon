# 2212
# Gold V

N = int(input())
M = int(input())
arr = list(map(int, input().split()))


arr.sort()

dif = []

for i in range(1, N):
    dif.append(arr[i] - arr[i-1])

dif.sort()

print(sum(dif[:N - M]))


    
