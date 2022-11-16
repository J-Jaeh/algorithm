def solution(dot):
    result =1
    if dot[0] >0 and dot[1]>0:
          return result
    result +=1
    if dot[0]<0 and dot[1]>0:
        return result
    result +=1
    if dot[0]<0 and dot[1]<0:
        return result
    result +=1
    return result