# 1436
# Silver V

N = int(input())

def count_six(n):
    six = 0
    count = 0

    while n > 0:
        if n % 10 == 6:
            count += 1
            six = max(count, six)
        else:
            count = 0

        n //= 10
    
    return six
i = 666
while True:
    if str(i).find('666') != -1:
        N -= 1
    if N == 0:
        print(i)
        break
    i +=1
 
        