# 2775
# bronze I

arr = [[0 for _ in range(15)] for _ in range(15)]

for i in range(15):
    arr[0][i] = i
    arr[i][1] = 1

for a in range(1, 15):
    for b in range(1, 15):
        arr[a][b] = arr[a][b -1] + arr[a-1][b]
T = int(input())
for _ in range(T):
    k = int(input())
    n = int(input())
    print(arr[k][n])

    