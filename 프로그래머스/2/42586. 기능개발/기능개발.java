import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

class Solution{
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {

        Deque<Progresse> q = new ArrayDeque<>();
        for (int progress : progresses) {
            q.add(new Progresse(progress,0));
        }
        // 유사스택을 이용해면 될듯한다 그냥 일단 앞으로 꺼냇자나 그럼 
        // 1단계가 완료할 꺼 계산을 하면 되자나
        int index=0;
        int[] temp= new int[progresses.length];
        while (!q.isEmpty()){
            Progresse check=q.pop();
            int remain=100-check.pro;
            int day = (remain-1)/speeds[index]+1;
            temp[index++]=day;
        }
        ArrayList<Integer> answer =new ArrayList<>();
        int maxDay = temp[0];
        int count=1;
        for(int i=1;i<temp.length;i++){
            if (maxDay<temp[i]){
                maxDay=temp[i];
                answer.add(count);
                count=1;
            }else{
                count++;
            }
        }
        answer.add(count);
        return answer;
    }
    private class Progresse{
        int pro;
        int count;

        public Progresse(int pro, int count) {
            this.pro = pro;
            this.count = count;
        }
    }
}