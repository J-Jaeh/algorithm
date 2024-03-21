# 오늘은 몇용일 ?

# 일단 수를 다받은 다음에 나누기 7?

### 제출 했으나 틀림. 모르겠다 !!!
import sys

def input():
    return sys.stdin.readline().rstrip()

X,Y = map(int,input().split())

total_day=Y

if X==2:
    total_day+=31
elif X==3:
    total_day+=(31+28)
elif X==4:
    total_day+=(31+28+31)
elif X==5:
    total_day+=(31+28+31+30)
elif X==6:
    total_day+=(31+28+31+30+31)
elif X==7:
    total_day+=(31+28+31+30+31+30)
elif X==8:
    total_day+=(31+28+31+30+31+30+31)
elif X==9:
    total_day+=(31+28+31+30+31+30+31+31)
elif X==10:
    total_day+=(31+28+31+30+31+30+31+31+30)
elif X==11:
    total_day+=(31+28+31+30+31+30+31+31+30+31)
elif X==12:
    total_day+=(31+28+31+30+31+30+31+31+30+31+30)


#SUN, MON, TUE, WED, THU, FRI, SAT

day = (total_day-1)%7
if day==0:
    print("MON",end='')
elif day==1:
    print("TUE",end='')
elif day==2:
    print("WED",end='')
elif day==3:
    print("THU",end='')
elif day==4:
    print("FRI",end='')
elif day==5:
    print("SAT",end='')
elif day==6:
    print("SUN",end='')