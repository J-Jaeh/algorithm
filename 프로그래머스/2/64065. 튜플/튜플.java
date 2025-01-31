import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    static class Number{
        int v;
        int c;
        public Number(int v, int c) {
            this.v = v;
            this.c = c;
        }
    }
    public int[] solution(String s) {
        String[] strings = s.replaceAll("[{}]","" ).split(",");

        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Number> numbers = new PriorityQueue<>((a,b)->Integer.compare(b.c,a.c));
        for (String sn : strings) {
            int n=Integer.parseInt(sn);
            if(!map.containsKey(n)){
                map.put(n,1);
            }else{
                map.put(n,map.get(n)+1);
            }
        }
        for (Integer key : map.keySet()) {
            numbers.add(new Number(key,map.get(key)));
        }
        int[] answer = new int[numbers.size()];

        int i = 0;
        while (!numbers.isEmpty()){
            answer[i++]=numbers.poll().v;
        }

        return answer;
    }
}