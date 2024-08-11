import sys

count=0

sys.setrecursionlimit(3000)

def solution(number):
    global count
    recur(0,[],number)
    return count

def recur(start:int,arr:list,number:list):
    global count
    if len(arr) == 3:
        if sum(arr)==0:
            count+=1
    for i in range(start,len(number)):
        input =number[i]
        recur(i+1,arr+[input],number)