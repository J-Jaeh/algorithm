def solution(i, j, k):
    count = 0
    for a in range(i,j+1):
        count += str(a).count(str(k))
    return count