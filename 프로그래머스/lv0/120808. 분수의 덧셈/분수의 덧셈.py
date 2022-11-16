def solution(denum1, num1, denum2, num2):
    answer = [0, 0]
    answer[0] = (denum1 * num2) + (denum2 * num1)
    answer[1] = num2 * num1
    max_value = 0
    for a in range(1, answer[0] + 1):
        if answer[0] % a == 0 and answer[1] % a == 0:
            max_value = a

    answer[0] = int(answer[0] / max_value)
    answer[1] = int(answer[1] / max_value)

    return answer
            
    
    return answer