import sys

n=int(sys.stdin.readline().strip())
# 도수 분포표만들기
dosu_list=[0]*10001
for i in range(n):
    dosu_list[int(sys.stdin.readline())]+=1


for i in range(len(dosu_list)):
    if dosu_list[i]>0:
            for _ in range(dosu_list[i]):
                print(i)