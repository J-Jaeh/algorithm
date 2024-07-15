import sys

def input():
    return sys.stdin.readline().rstrip()

def sol(x:int,y:int,w:int,h:int)->int:
    x_min = min(w-x,x)
    y_min = min(h-y,y)
    return min(x_min,y_min)


if __name__ == '__main__':
    x,y,w,h = map(int,input().split())
    print(sol(x, y, w, h))