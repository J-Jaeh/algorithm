import sys

def input():
    return sys.stdin.readline().rstrip()



def sol(strs:str)->list:
    abc=[-1]*26

    for i in range(26):
       if chr(ord('a')+i) in strs:
        index=strs.index(chr(ord('a')+i))
        abc[i]=index

    return abc



if __name__ == "__main__":
    input_strings=input()
    print(*sol(input_strings))