# 1018
# Silver IV


N, M = map(int, input().split())

min_val = 8 * 8 

chass = [input() for _ in range(N)]

# print(chass)

for x in range(M - 8 + 1):
    for y in range(N - 8 + 1):
        block = chass[y][x]

        count = 0
        for i in range(0, 8):
            for j in range(0, 8):
                compare_block = chass[y + i][ x + j]
                if (block == chass[y + i][ x + j]) == ((i + j) % 2 == 0):
                    count += 1

        count = min(count, 64 - count)

        min_val = min(count, min_val)
        

                
print(min_val)