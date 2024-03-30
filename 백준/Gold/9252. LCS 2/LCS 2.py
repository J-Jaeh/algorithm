# LCS2 일단 LCS 1처럼 풀어보고 시간초과뜨면 개선
# 아 ! 이번엔 글자까 추가..!
import sys
def input():
    return sys.stdin.readline().rstrip()

def LCS():
    string_list1=list(input())
    string_list2=list(input())

    answer_list=[['' for _ in range(len(string_list2)+1)] for _ in range(len(string_list1)+1)]
    ### 같으면 -1-1 위치 문자와 같은 문자합치기 다르면 긴글자 선택 기준은 그냥 행으로
    for i in range(1,len(string_list1)+1):
        for j in range(1,len(string_list2)+1):
            if string_list1[i-1] == string_list2[j-1]:
                answer_list[i][j]+=answer_list[i-1][j-1]+string_list2[j-1]
            else:
                if len(answer_list[i-1][j])<len(answer_list[i][j-1]):
                    answer_list[i][j]+=answer_list[i][j-1]
                else:
                    answer_list[i][j]+=answer_list[i-1][j]

    # print(*answer_list,sep='\n')
    answer=answer_list[len(string_list1)][len(string_list2)]
    print(len(answer))
    print(answer)


if __name__ == '__main__':
    LCS()