#11723
# Vilver V

S = set()
nums = {i for i in range(1, 21)}
M = int(input())



for _ in range(M):
    command = input()
    
    if command == "all":
        S = {i for i in range(1, 21)}
        continue

    if command == "empty":
        S =set() 
        continue


    order, value = command.split()
    v = int(value)

    if order == "add":
        S.add(v)
    elif order == "remove":
        S.discard(v)
    elif order == "check":
        if v in S:
            print(1)
        else:
            print(0)
    elif order == "toggle":
        if v in S:
            S.discard(v)
        else:
            S.add(v)