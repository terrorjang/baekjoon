# 10816
# Silver IV


N = int(input())
having_cards = list(map(int, input().split()))
having_map = dict()
for num in having_cards:
    if having_map.get(num, 0) == 0:
        having_map[num]= 1
    else:
        having_map[num]+=1 
        



M = int(input())
input_cards = list(map(int, input().split()))

answer = []
for num in input_cards:
    count = having_map.get(num, 0)
    answer.append(str(count))

    
print(" ".join(answer))
    