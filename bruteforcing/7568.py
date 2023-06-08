# 7568
# Silver V

N = int(input())

arr = [list(map(int, input().split())) for _ in range(N)]
# arr.sort(key=lambda l: l[0] + l[1], reverse=True)
# sorted(arr, key=lambda l:l[0] + l[1])
# sum_arr= [d[0] + d[1] for d in arr]
# print(arr)

for a in arr:
    rank = 1
    for b in arr:
        if a[0] < b[0] and a[1] < b[1]:
            rank += 1

    print(rank, end=' ')
    


