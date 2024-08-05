import sys


def input():
    return sys.stdin.readline().rstrip()

def sol(x:int,y:int,vlist:list,hlist:list)->int:
    vlist.sort()
    hlist.sort()
    vmax=max_value(x,vlist)
    hmax=max_value(y,hlist)
    return vmax*hmax

def max_value(x:int,vlist:list)->int:
    if not vlist:
        return x
    max_v = vlist[0]
    for v in range(1, len(vlist)):
        temp = vlist[v] - vlist[v - 1]
        max_v = max(max_v, temp)
    max_v = max(max_v, x - vlist[-1])
    return max_v


if __name__ == "__main__":
    x ,y = map(int,input().split())
    tc=int(input())
    v_list =[]
    h_list =[]
    for _ in range(tc):
        a, b = map(int, input().split())
        if a == 0:# 가로 ! h
            h_list.append(b)
        else:
            v_list.append(b)
    print(sol(x,y,v_list,h_list))
