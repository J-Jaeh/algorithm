# https://school.programmers.co.kr/learn/courses/30/lessons/120922

def solution(M, N):
    # 긴값을 기준으로 나누고 나눈 횟수만큼 n에 더해줌 ?
    max_v = max(M,N)
    min_v = min(M,N)
    a=(max_v-1)*min_v # 늘어난 잘라야하는 횟수 ?일단 가장 긴변을 자르는 횟수.에 N을 곱하면 늘어난 종이수 ?

    return a+min_v-1