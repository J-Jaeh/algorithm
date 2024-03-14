a=int(input())

b=a%4
c=a%100
d=a%400
# 윤년의 조건은
if (b==0 and c!=0)or(d==0):
    print(1)
else:
    print(0)