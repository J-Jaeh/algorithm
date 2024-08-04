# 특이한 정렬

from functools import cmp_to_key

num=None

def solution(numlist:list, n):
    global num
    num=n
    numlist.sort()
    numlist.sort(key=cmp_to_key(comp))
    return numlist

def comp(x,y)->int:
    global num
    if abs(num-x)>abs(num-y):
        return 1
    elif abs(num-x)<=abs(num-y):
        return -1