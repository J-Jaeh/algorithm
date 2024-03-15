arr=[0]*10
def sol(n):
    cal_list= list(str(n))
    for i in cal_list:
        arr[int(i)]+=1

a = int(input())
b = int(input())
c = int(input())

cal = a*b*c
sol(cal)

for i in arr:
    print(i)
