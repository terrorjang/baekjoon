#2512
# Silver III

N = int(input())

arr = list(map(int, input().split()))

M = int(input())

if sum(arr) <= M:
    print(max(arr))
    exit()

s = 0
e = M

answer = 0
while s <= e:
    mid = (s + e) // 2
    total = 0
    for a in arr:
        total += min(mid, a)

    
    if total > M:
        e = mid - 1
    else:
        s = mid + 1
        answer = mid

print(answer)
