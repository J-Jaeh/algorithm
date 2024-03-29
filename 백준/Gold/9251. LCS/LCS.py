import sys
def input():
    return sys.stdin.readline().rstrip()

j_string_list=list(input())

i_string_list=list(input())
# print(i_string_list)
# print(j_string_list)
answer_list=[[0 for _ in range(len(j_string_list)+1)] for _ in range(len(i_string_list)+1)]

# print(*answer_list,sep='\n')

for i in range(1,len(i_string_list)+1):
    for j in range(1,len(j_string_list)+1):
        ### 원본 글자 받는 리스트 인덱스 조심 !
        if j_string_list[j-1] == i_string_list[i-1]:
            answer_list[i][j]=answer_list[i-1][j-1]+1
        else:
            answer_list[i][j]= max(answer_list[i-1][j],answer_list[i][j-1])

# print("결과",*answer_list,sep='\n')

print(answer_list[len(i_string_list)][len(j_string_list)])