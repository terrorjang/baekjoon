# 21758
# Gold V

N = int(input())
arr = list(map(int, input().split()))

total = sum(arr)

value = 2 * (total - (arr[0] + arr[1]))
answer = value

for i in range(2, N):
    value += arr[i-1] - arr[i] * 2
    answer = max(answer, value)

value = 2 * (total - (arr[-1] + arr[-2]))
answer = max(value, answer)

for i in range(N-2, 1, -1):
    value+= arr[i] - arr[i-1] * 2
    answer = max(answer, value)
    

value = arr[1] + total - arr[0] - arr[-1]
answer = max(value, answer)

for i in range(2, N -2):
    value+= arr[i] - arr[i-1]
    answer = max(answer, value)

print(answer)
