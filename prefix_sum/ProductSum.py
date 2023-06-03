# 13900
# Silver IV



N = int(input())

arr = list(map(int, input().split()))

sum_arr = [arr[0]]

for num in arr[1:]:
    sum_arr.append(sum_arr[-1] + num)


    
result = 0
for i in range(N):
    result+= arr[i] * (sum_arr[-1] - sum_arr[i])

print(result)