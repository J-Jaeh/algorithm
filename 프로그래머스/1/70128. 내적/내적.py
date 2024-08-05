
def solution(a:list, b:list):
    size = len(a)
    answer=0
    for i in range(size):
        answer+=a[i]*b[i]
    return answer