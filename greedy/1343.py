# 1343
# Silver V

target = input()
# print(len(target))

answer = ''

count = 0
for c in target:
    if c == '.':
        if count == 4:
            answer += 'AAAA'
        elif count == 2:
            answer += 'BB'
        elif count == 1 or count == 3:
            count = -1
            break
        answer += c
        count = 0
    else:
        count += 1
        if count == 4:
            count = 0
            answer += 'AAAA'

    
if count == -1:
    answer = -1
elif count == 2:
    answer += 'BB'
elif count == 0:
    pass
else:
    answer = -1

 

print(answer)