def solution(hp):
    damge = [5,3,1]
    count =0
    for a in damge:
        count +=int(hp//a)
        hp -=a*int(hp//a)
    return count