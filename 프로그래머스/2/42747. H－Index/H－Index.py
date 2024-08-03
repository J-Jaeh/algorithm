def solution(citations:list):

    # [1 10 12 15 16]
    citations.sort(reverse=True)
    # [16 15 12 10 1]
    # i는 논문의 갯수임
    # count 는 인용횟수
    temp =0
    for i,count in enumerate(citations,start=1):
        if count>=i:
            temp=i
        else:
            break
            
    return temp

