class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int line = 1;
        while(true){
            if(yellow%line == 0){

                int temp = (yellow/line)*2+4+line*2;
                if (temp == brown){
                    answer[0]=(yellow/line)+2;
                    answer[1]=line+2;
                    break;

                }
            }
            line++;
        }

        return answer;
    }
}