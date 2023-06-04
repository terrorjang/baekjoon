# 10815
# Silver V

N = int(input())
arr1 = list(map(int, input().split()))

M = int(input())
arr2 = list(map(int, input().split()))

answer = ['0'] * M

arr1.sort()

def search(n):
    s = 0
    e = N - 1
    while s <= e:
        mid = (s + e) // 2
        if arr1[mid] == n:
            return True

        if n > arr1[mid]:
            s = mid + 1
        else:
            e = mid - 1

    return False;


for i in range(M):
    if search(arr2[i]):
        answer[i] = '1'
print(' '.join(answer))