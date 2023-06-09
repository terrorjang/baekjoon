# 2470
# Gold V

N = int(input())

arr = list(map(int, input().split()))
arr.sort()

start = 0
end = N -1 

minimum = abs(arr[start] + arr[end])
result = [arr[start], arr[end]]

while start < end:
    merge = arr[start] + arr[end]
    if abs(merge) < minimum:
        minimum = abs(merge)
        result = [arr[start], arr[end]]
    if merge < 0:
        start += 1
    elif merge > 0:
        end -= 1
    else:  
        break

print(result[0], result[1])
       