import java.util.ArrayList;

class Solution {
    public  ArrayList<Integer> solution(String[] strlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (String s : strlist) {
            answer.add(s.length());
        }
        
        return answer;   //스트림으로 하려다 실패
    }
}