# 11728
# Silver V

N, M = map(int, input().split())

arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))


i = 0
j = 0
while i < N or j < M:
    if i == N:
        print(arr2[j], end=' ')
        j+= 1
        continue
    if j == M:
        print(arr1[i], end=' ')
        i += 1
        continue
        
    if arr1[i] < arr2[j]:
        print(arr1[i], end=' ')
        i += 1
    else:
        print(arr2[j], end=' ')
        j += 1

        
    
