def solution(t:str, p:str):
    # 글자 자르기로 할깝쑈?
    lp=0
    rp=len(p)
    count=0
    while rp<=len(t):
        temp = t[lp:rp]
        if temp<=p:
            count+=1
        lp+=1
        rp+=1

    return count

if __name__ == '__main__':
    print(solution("10203","15"))