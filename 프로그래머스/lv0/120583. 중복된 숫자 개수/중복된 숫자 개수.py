def solution(array, n):
    count = 0
    for a in array:
        if n == a:
            count += 1

    return count