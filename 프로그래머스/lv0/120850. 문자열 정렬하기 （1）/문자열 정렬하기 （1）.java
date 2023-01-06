import java.util.ArrayList;

class Solution {
 public ArrayList<Integer> solution(String my_string) {
        char[] chars = my_string.toCharArray();
        ArrayList<Integer> arrayList = new ArrayList<>();    
        for (char c : chars) {
            if(c<60){
                arrayList.add((int) c);
            }
        }
        
        return arrayList;
    }
}