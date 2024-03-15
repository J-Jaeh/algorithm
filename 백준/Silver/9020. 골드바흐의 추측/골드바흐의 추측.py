
prime_list = [True]*10000
prime_list[0] = False
prime_list[1] = False
for i in range(2,10000):
    if prime_list[i]:
        j=2
        while i*j <10000:
            prime_list[i*j] = False
            j+=1
def gold(n):
    return_list=[]
    for i in range(2,(n//2)+1):
        arr = []
        if prime_list[i]:
            a=n-i
            if prime_list[a]:
                arr.append(i)
                arr.append(a)
                return_list.append(arr)
    return return_list

n= int(input())


for i in range(n):
    a=int(input())
    check_List=gold(a)
    min=check_List[0]
    for i in check_List[1:]:
        min_a=min[0]
        min_b=min[1]
        if (min_b-min_a)>i[1]-i[0]:
            min=i
    print(*min)
