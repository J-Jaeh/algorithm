def solution(order):
    count = 0
    for string in str(order):
        if string == "3":
            count +=1
        elif string == "6":
            count +=1
        elif string == "9":
            count +=1
            
    answer = count
    return answer