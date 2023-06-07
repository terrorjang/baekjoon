# 1065
# Vilver IV

N = int(input())

def is_hansu(n):
    if n < 100 or n == 1000:
        return False

    n1 = n % 10
    n2 = n // 10 % 10
    n3 = n // 100 % 10

    return n2 - n1 == n3 - n2

    

    

ans = N

for i in range(100, N + 1):
    if is_hansu(i) == False:
        ans-= 1

        
print(ans)



