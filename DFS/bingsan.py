#2573
# Gold IV
N, M = map(int, input().split())

arr = [list(map(int, input().split())) for _ in range(N)]

dx = [0,0,1,-1]
dy = [1,-1,0,0]

# BFS
dx = [0,0,1,-1]
dy = [1,-1,0,0]
year = -1
while True:
    year += 1
    visit = [[False for _ in range(M)] for _ in range(N)]
    q = [] 
    count = 0
    for xi in range(M):
        for yi in range(N):
            if arr[yi][xi] <= 0:
                continue
            if visit[yi][xi]:
                continue

            q.append([xi, yi])

            c = 0

            while len(q) > 0 :
                x, y = q.pop(0)
                if visit[y][x]:
                    continue

                visit[y][x] = True

                for i in range(4):
                    nx = x + dx[i]
                    ny = y + dy[i]

                    if 0 <= nx < M and 0<= ny < N:
                        if visit[ny][nx] == False and arr[ny][nx] <= 0:
                            arr[y][x] -= 1
                        if visit[ny][nx] == False and arr[ny][nx] > 0:
                            q.append([nx, ny])

            count += 1
    if count >= 2:
        break

print(year)
# DFS Recursion Error
# recursionerror count is 1000.. on BOJ
# def DFS(x, y):
#     visit[y][x] = True

#     c = 0
#     for i in range(4):
#         nx = x + dx[i]
#         ny = y + dy[i]

#         if nx < 0 or nx >=M  or ny < 0 or ny >= N :
#             continue
        
#         if visit[ny][nx] == False and arr[ny][nx] == 0 :
#             c+=1

#         if visit[ny][nx] == True or arr[ny][nx] == 0 :
#             continue

#         DFS(nx, ny)
    
#     arr[y][x] = max(0, arr[y][x] - c)

# def count_bingsan():
#     count = 0
#     for xi in range(M):
#         for yi in range(N):
#             if visit[yi][xi]:
#                 continue
#             if arr[yi][xi] == 0:
#                 continue
#             DFS(xi,yi)
#             count += 1
#     return count

# year = -1
# while True:
#     visit = [[False for _ in range(M)] for _ in range(N)]
#     year += 1
#     if count_bingsan() >= 2:
#         break

# print(year)




        