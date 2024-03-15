def solve(arr):
    n=arr[0]
    total_sum=0
    over_avr=0
    for i in arr[1:]:
        total_sum+=i
    avr=total_sum/n

    for i in arr[1:]:
        if avr<i:
            over_avr+=1

    return round((over_avr/n)*100,3)

n =int(input())

for i in range(n):
    arr=list(map(int,input().split()))
    print(str(solve(arr))+"%")