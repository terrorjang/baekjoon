# 9461
# Silver III

T = int(input())

arr = [0, 1, 1]
for _ in range(T):
    N = int(input())
    while len(arr) < N + 1:
        arr.append(arr[-2] + arr[-3])

    print(arr[N])