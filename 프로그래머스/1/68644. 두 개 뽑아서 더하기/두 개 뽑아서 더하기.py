def solution(numbers):
    # 이중for문

    answer = []
    for n in range(len(numbers)-1):
        for m in range(n+1,len(numbers)):
            answer.append(numbers[n]+numbers[m])

    set_answer= set(answer)
    return sorted(list(set_answer))