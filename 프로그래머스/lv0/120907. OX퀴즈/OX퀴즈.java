import java.util.ArrayList;

class Solution {
    public Object solution(String[] quiz) {
        ArrayList<String> OXList = new ArrayList<>();

        for(int i=0;i<quiz.length;i++ ){
            String[] new_quiz=quiz[i].split(" ");
             int a = Integer.parseInt(new_quiz[0]);
             int b = Integer.parseInt(new_quiz[2]);
             int c = Integer.parseInt(new_quiz[4]);

            int result;
            if(new_quiz[1].equals("+")){
                result = a + b;
            }else {
                result = a - b;
            }

            if(result == c){
                OXList.add("O");
            }else {
                OXList.add("X");
            }
        }
            return OXList;
    }
}