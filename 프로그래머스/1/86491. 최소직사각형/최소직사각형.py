
def solution(sizes):
    big=[]
    small=[]
    for size in sizes:
        big.append(max(size[0],size[1]))
        small.append(min(size[0],size[1]))
    return max(big)*max(small)