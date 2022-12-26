import java.util.ArrayList;
import java.util.Comparator;

class Solution {
   public int solution(int[] numbers) {
        ArrayList<Integer> newNumbers = new ArrayList<>();

        for (int number : numbers) {
            newNumbers.add(number);
        }
       
        newNumbers.sort(Comparator.naturalOrder());
        
        return newNumbers.get(newNumbers.size()-1)*newNumbers.get(newNumbers.size()-2); 
        }
}