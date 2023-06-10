# 2309
# Bronze I

arr = [int(input()) for _ in range(9)]

# print(arr)

total = sum(arr) - 100
# print(total)
for i in range(8):
    for j in range(i + 1, 9):
        if arr[i]+ arr[j] == total:
            n, m = arr[i], arr[j]
            arr.remove(n)
            arr.remove(m)
            break

    if len(arr) < 9:
        break

arr.sort()
print('\n'.join(map(str,arr)))