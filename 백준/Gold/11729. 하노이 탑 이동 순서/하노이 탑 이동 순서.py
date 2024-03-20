n=int(input())

def hanoi(n,s,d,a):
    if n==1:
       return print(s,d)
    hanoi(n-1,s,a,d)
    print(s,d)
    hanoi(n-1,a,d,s)


print(2**n-1)
hanoi(n,1,3,2)