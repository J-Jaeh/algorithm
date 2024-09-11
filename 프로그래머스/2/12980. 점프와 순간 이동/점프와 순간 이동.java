import java.util.*;

public class Solution {
    public int solution(int n) {
        // 목표에서 거꾸로 접근해야할듯 ?
        // 5 -> 4 (카운트 +1)->2 -> 1 stop +1
        // 6 -> 3->(카운트 +1)->2 -> 1 stop +1
        // --
        //5000 -> 2500-> 1250 -> 625 +1
        //624-> 312 -> 156 -> 78-> 39 +1
        // 38 -> 19 +1
        // 18 -> 9 +1
        // 8-> 4 -> 2 ->1 +1 끝 
        int count =1 ;
        while (n != 1){
            if(n%2==0){
                n/=2;    
                continue;
            }
            count++;
            n--;
        }

        return count;
    }
}