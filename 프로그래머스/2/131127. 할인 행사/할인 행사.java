import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String,Integer> wantMap = new HashMap<>();
//        Map<String,Integer> now = new HashMap<>();
        int index = 0;

        for (String s : want) {
           wantMap.put(s,number[index++]);
        }

        // 10일차까지 셋팅
        int day =0;
        for ( ;day<10;day++){
            String dis = discount[day];
            if ( wantMap.containsKey(dis)){
                wantMap.put(dis,wantMap.get(dis)-1);
            }
        }
        if(check(wantMap)){
            answer++;
        }

        // 10 이상이면 살수 있는지 체크 하나 더하고 하나 빼고 해줘야하지
        // 이제 그 다음거 빼고 더하고 굿 ?  -10
        for(;day<discount.length;day++){
            String nowDiscount = discount[day];
            String plus = discount[day-10];
            if ( wantMap.containsKey(nowDiscount)){
                wantMap.put(nowDiscount,wantMap.get(nowDiscount)-1);
            }
            
            if ( wantMap.containsKey(plus)){
                wantMap.put(plus,wantMap.get(plus)+1);
            }
            
            if(check(wantMap)){
                answer++;
            }
        }

        return answer;
    }

    private boolean check(Map<String,Integer> input){
        for (Integer value : input.values()) {
            if (value >0){
                return false;
            }
        }
        return true;
    }
}