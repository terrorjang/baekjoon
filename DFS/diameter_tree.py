# 1967
# Gold IV

def bfs(start):
    check = [-1] * (N + 1)
    q = [start]
    check[start] = 0

    _max = [0,0]
    while len(q) > 0 :
        node = q.pop(0)
        for n, w in tree[node]:
            if check[n] > -1:
                continue
            q.append(n)
            check[n] = check[node] + w
            if _max[0] < check[n]:
                _max = check[n],n 
    
    return _max

N = int(input())

tree = [[] for _ in range(N + 1)]

for i in range(N - 1):
    n1, n2, weight = list(map(int, input().split()))
    tree[n1].append([n2, weight])
    tree[n2].append([n1, weight])


w, node = bfs(1)
w, node = bfs(node)
print(w)

