import java.util.ArrayList;
import java.util.Comparator;

class Solution {
 public ArrayList<Integer> solution(String my_string) {
        char[] chars = my_string.toCharArray();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (char c : chars) {
            if(c<60){
                arrayList.add(c-48);
            }
        }
        arrayList.sort(Comparator.naturalOrder());
   /*     int largeValue = arrayList.get(0);

        for (int i = 0 ; i <arrayList.size();i++){
            if (arrayList.get(i)<arrayList.get(){

            }
         */

        return arrayList;
    }
}