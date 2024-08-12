import sys

def input():
    return sys.stdin.readline().rstrip()

def sol(k,p)->int:
    for _ in range(len(p)):
        for party in p:
            if party.intersection(k):
                k = k.union(party)
    cnt = 0

    for i in p:
        if i & k:
            continue
        cnt += 1
    return cnt

if __name__ == "__main__":
    N,M = map(int,input().split())
    k = set(input().split()[1:])
    p = [set(input().split()[1:]) for _ in range(M)]
    print(sol(k,p))
