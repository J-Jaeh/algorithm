def solution(num, total):
    n = num

    average = total / n

    start = int(average - (n - 1) / 2)

    answer = [start + i for i in range(n)]
    return answer