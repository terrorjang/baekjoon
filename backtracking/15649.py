# 15649
# Silver III

N, M = map(int, input().split())
visited = [False] * N
result = []


def solution(d,n, m):
    if d == m:
        print(" ".join(map(str, result)))
        return
    
    for i in range(n):
        if visited[i] == False:
            visited[i] = True
            result.append(i + 1)
            solution(d + 1, n, m)
            visited[i] = False
            result.pop()


solution(0, N, M)