# 1644
# Gold III

N = int(input())

arr = [False] * (N + 1)

sosu = []
for i in range(2, N + 1):
    if arr[i]:
        continue
    
    sosu.append(i)
    for j in range(i, N + 1, i):
        arr[j] = True

if N == 1:
    print(0)
else:
    start = 0
    end = 0
    total = sosu[0]
    count = 0

    while start <= end:
        if total >= N:
            if total == N:
                count += 1
            total -= sosu[start]
            start += 1
        elif end >= len(sosu) - 1:
            break
        else:
            end += 1
            total += sosu[end]

    print(count)
    
        
