# 4673
# Silver V

def d(n):
    s = n 
    while n > 0:
        s += n % 10
        n //= 10
    return s 

    
arr = [False] * 10001
arr[0] = True

for i in range(1, 10001):
    if arr[i]:
        continue

    n = d(i)
    while n < 10001:
        arr[n] = True
        n = d(n)

        
for i, b in enumerate(arr):
    if  b == False:
        print(i)

