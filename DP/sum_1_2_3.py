# 9095
# Silver III

T = int(input(0))

arr = [0, 1, 2, 4]

for _ in range(T):
    n = int(input())

    for i in range(len(arr), n + 1):
        arr.append(arr[i-1] + arr[i-2] + arr[i-3])

    print(arr[n])


