# 2501
# Bronze III

N, K = map(int, input().split())

limit =int( N ** 0.5)
nums = []

for i in range(1, limit + 1):
    if N % i > 0:
        continue
    

    nums.append(i)
    if i * i < N:
        nums.append(N//i)

    
nums.sort()
if len(nums) < K :
    print(0)
else:
    print(nums[K - 1])


    


