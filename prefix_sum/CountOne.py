#9527
# Gold II

A, B = map(int, input().split())

arr = [0, 1]

n_pow = 1

while B >= 2 ** n_pow and len(arr) == 2 ** n_pow:
    for i in range(2 ** n_pow):
        arr.append(1 + arr[i])
        if len(arr) > B:
            break

    n_pow+=1

print(sum(arr[A:B+1]))


