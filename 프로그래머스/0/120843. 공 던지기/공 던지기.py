from collections import deque


def solution(numbers, k):
    # 2씩증가하는데 과연 k 번째 던지는 사람은 누구인가 
    # 원형큐만들어서 하고싶은데 or queq?
    q = deque(numbers)
    count = 1
    while count != k:
        q.append(q.popleft())
        q.append(q.popleft())
        count += 1

    return q.popleft()
