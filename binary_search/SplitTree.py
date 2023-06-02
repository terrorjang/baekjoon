# 2805
# Silver II

N, M = map(int, input().split())
trees = list(map(int, input().split()))

start, end = 0, max(trees)

while start <= end:
    mid = (start+end)//2
    length = 0
    
    for l in trees:
        if l > mid:
            length += l - mid
            
    if  length >= M:
        start = mid + 1
    else:
        end = mid - 1


print(end)


