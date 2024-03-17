def z(n,r,c)->int:
    if n==0:
        return 0;
    harf_length = (2 ** n)//2
    # 크고 크면 4
    if harf_length<= c and harf_length <= r :
        d=3
        # 아 뭔가 사분면더하고 뭔갈 만들어 줘야하는ㄷ ㅔ
        sum=d*(4**(n-1))
        return sum+z(n-1,r-harf_length,c-harf_length)
    # 작고 작으면 1
    elif harf_length > c and harf_length > r :
        d=0
        sum = d * (4 ** (n - 1))
        return sum + z(n - 1, r, c)
    #3
    elif c < harf_length <= r:
        d=2
        sum = d * (4 ** (n - 1))
        return sum +z(n - 1, r - harf_length, c)
    #2
    elif c >= harf_length> r:
        d=1
        sum = d * (4 ** (n - 1))
        return sum +z(n - 1, r ,c- harf_length)

n,r,c=map(int,input().split())
print(z(n,r,c))