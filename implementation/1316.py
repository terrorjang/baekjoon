# 1316
# Silver V

from sys import stdin

N = int(stdin.readline())

count = N

for _ in range(N):
    voca = stdin.readline()
    continue_count = {}

    prev_char = ""
    for v in voca:
        c = continue_count.get(v, 0)
        if prev_char != v and c != 0:
            count -= 1
            break
        prev_char = v
        continue_count[v] = 1


            

print(count)
        