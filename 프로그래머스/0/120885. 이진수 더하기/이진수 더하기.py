def solution(bin1, bin2):
    a = int(bin1,2)
    b = int(bin2,2)
    c = a+b
    return str(bin(c))[2:]