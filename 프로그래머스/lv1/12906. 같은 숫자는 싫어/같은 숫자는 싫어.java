import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        int sameValue = -1;
        for (int i : arr) {
           if(sameValue!=i){
               arrayList.add(i);
               sameValue=i;
           }
        }
        return arrayList;
       
    }
}