def solution(n):
    arr=list(map(str,str(n)))
    arr.sort(reverse=True)
    return int(''.join(arr))