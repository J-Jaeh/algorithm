
def solution(array:list)->int:
    #7의 갯수 카운트하기
    answer = 0
    for num in array:
        answer+=str(num).count('7')
    
    return answer