import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int a, int b) {
        // 몇일 인지만ㄴ 계산하면 되는거 아닌강 ?
        // 31 -> 29 -> 31 -> 30 -> 31 -> 30->31->31->30->31->30->31
        // 1      2     3     4     5    6    7   8  9   10   11  12 
        Map<Integer,Integer> monthDay = new HashMap<>();
        monthDay.put(1,31);
        monthDay.put(2,29);
        monthDay.put(3,31);
        monthDay.put(4,30);
        monthDay.put(5,31);
        monthDay.put(6,30);
        monthDay.put(7,31);
        monthDay.put(8,31);
        monthDay.put(9,30);
        monthDay.put(10,31);
        monthDay.put(11,30);
        monthDay.put(12,31);
        int day = b;
        
        for(int i=1;i<a;i++){
            day+=monthDay.get(i);
        }
        
        int dayToE = (day-1)%7;
        
        switch (dayToE){
            case 0 :
                return "FRI";
            case 1 :
                return "SAT";
            case 2 :
                return "SUN";
            case 3 :
                return "MON";
            case 4 :
                return "TUE";
            case 5 :
                return "WED";
            case 6 :
                return "THU";
                
        }
        return "";
    }
}