# 15650
# Silver III

N, M = map(int, input().split())
visited = [False] * N
out = []

def solution(d,index, n, m):
    if d == m:
        print(' '.join(map(str, out)))
        return
    for i in range(index, n):
        if not visited[i]:
            visited[i] = True
            out.append(i + 1)
            solution(d + 1, i + 1, n, m )
            visited[i] = False
            out.pop()
        
solution(0, 0,N, M )
        
