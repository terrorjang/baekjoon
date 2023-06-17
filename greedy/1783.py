# 1783
# Silver III

N, M = map(int, input().split())

if N == 1:
    count = 1
elif N == 2:
    if M <= 7:
        count = (M + 1) // 2
    else:
        count = 4
else: # M >= 3
    if M <= 4:
        count = M
    elif 5<= M <=6:
        count = 4
    else:
        count = M - 2

print(count)