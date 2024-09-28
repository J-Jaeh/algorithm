import java.util.ArrayList;
import java.util.List;

class Solution {
public List<Integer> solution(int[] answers) {
    int[] num1 = {1,2,3,4,5};
    int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    List<Integer> answer = new ArrayList<>();
    int index =0;
    int num1S=0;
    int num2S=0;
    int num3S=0;
    for (int i : answers) {
        int num1I=index%num1.length;
        int num2I=index%num2.length;
        int num3I=index%num3.length;
        index++;
        if ( i == num1[num1I]){
            num1S++;
        }
        if ( i == num2[num2I]){
            num2S++;
        }
        if ( i == num3[num3I]){
            num3S++;
        }
    }
    int maxTemp1 = Math.max(num1S, num2S);
    int maxTemp2 = Math.max(num2S, num3S);
    int max = Math.max(maxTemp1,maxTemp2);
    
    if(max==num1S){
        answer.add(1);
    }
    if(max==num2S){
        answer.add(2);
    }
    if(max==num3S){
        answer.add(3);
    }
    return answer;
}
}