# 1072
# Silver III

X,Y = map(int, input().split())

Z = Y * 100 // X

if Z >= 99:
    print(-1)
    exit()

answer = 0
left = 1
right = X
while left<=right:
    mid = (left + right) // 2
    temp = (Y + mid) * 100 // (X + mid)

    if temp == Z:
        left = mid + 1

    else:
        right = mid - 1
        answer = mid

print(answer)



