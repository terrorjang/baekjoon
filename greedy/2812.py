# 2812
# Gold III


N, K = map(int, input().split())

num_str = input()

result = []
dk = K

for c in num_str:
    while dk > 0 and result:
        if result[-1] < c:
            result.pop()
            dk -= 1
        else:
            break
    
    result.append(c)

print(''.join(result[:N - K]))



    




    

