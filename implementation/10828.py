# 10828
# Silver IV
from sys import stdin

N = int(stdin.readline())
arr = []

for _ in range(N):
    command = stdin.readline().strip()

    if command == "pop":
        if len(arr) > 0:
            n = arr.pop(-1)
            print(n)
        else:
            print(-1)
    elif command =="size":
        print(len(arr))
    elif command =="empty":
        if len(arr) == 0:
            print(1)
        else:
            print(0)
    elif command =="top":
        if len(arr) > 0:
            print(arr[-1])
        else:
            print(-1)
    else:
        num = command.split()[1]
        arr.append(num)

   