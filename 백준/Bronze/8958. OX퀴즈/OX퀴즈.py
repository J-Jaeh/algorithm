def solve(string):
    arr = list(string)
    sum=0
    weight = 1
    for n in arr:
        if n =="O":
            sum+=weight
            weight+=1
        else:
            weight=1
    return sum
a = int(input())

for i in range(a):
    print(solve(input()))