import sys

def input():
    return sys.stdin.readline().rstrip()

def boom(input_s: str, bomb: str) -> str:
    stacks = []
    bomb_len = len(bomb)
    
    for c in input_s:
        stacks.append(c)
        # 스택의 마지막 부분이 폭발 문자열과 일치하는지 확인
        if ''.join(stacks[-bomb_len:]) == bomb:
            del stacks[-bomb_len:]  # 폭발 문자열 제거
    
    result = ''.join(stacks)
    return result if result else "FRULA"

if __name__ == "__main__":
    inputs = input()
    b = input()
    print(boom(inputs, b))
