import java.util.PriorityQueue;

class Solution {
    public int solution(int k, int m, int[] score) {
        // 사과의 가격은 상자의 최하점 가격 k*m
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : score) {
            pq.add(i*-1);
        }
        int count=0;
        int[] temp=new int[m];
        while (!pq.isEmpty()){
            int highP = pq.poll()*-1;
            temp[count++] =highP;
            if(count==m){
                answer+=temp[m-1]*m;
                temp=new int[m];;
                count=0;
            }
        }
        return answer;
    }
}