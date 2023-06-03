# 21921
# Silver III

N, X = map(int, input().split())

arr =list(map(int, input().split())) 

sum_arr = []

for num in arr:
    if len(sum_arr) == 0:
        sum_arr.append(num)
    else:
        sum_arr.append(sum_arr[-1] + num)
    

max_counts = [sum_arr[X - 1]]

for i in range(X, N) :
    max_counts.append(sum_arr[i] - sum_arr[i-X])


max_num = max(max_counts)
if max_num ==0 :
    print("SAD")
else:
    count = 0
    for num in max_counts:
        if max_num == num:
            count+=1


    print(max_num)
    print(count)



