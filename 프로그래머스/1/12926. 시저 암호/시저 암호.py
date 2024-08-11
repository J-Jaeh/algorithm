def solution(s:str, n):
    answer=''
    for c in s:
        if c ==" ":
            answer += " "
            continue
        if c.islower():
            if c != " " and ord(c)+n <= ord('z'):
               new_c=ord(c)+n
               answer += chr(new_c)
            elif ord(c)+n >ord('z'):
                answer += chr(ord(c)+n-ord('z')+ord('a')-1)
        if c.isupper():
            if c != " " and ord(c) + n <= ord('Z'):
                new_c = ord(c) + n
                answer += chr(new_c)
            elif ord(c) + n > ord('Z'):
                answer += chr(ord(c) + n - ord('Z') + ord('A') - 1)
            
    return answer