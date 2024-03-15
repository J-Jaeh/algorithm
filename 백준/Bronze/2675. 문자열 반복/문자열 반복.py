def solve(a:list) -> str:
    n =int(a[0])
    sol=''
    for i in list(a[1]):
        sol+=i*n
    return sol

a = int(input())

for i in range(a):
    arr = list(map(str,input().split()))
    print(solve(arr))