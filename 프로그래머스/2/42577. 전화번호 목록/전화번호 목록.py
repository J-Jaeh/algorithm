def solution(phone_book:list):
    dic={}
    for x in phone_book:
        dic[x]=True

    for x in phone_book:
        temp =''
        for c in x:
            temp+=c
            if temp in dic and temp !=x:
                return False
    return True       
