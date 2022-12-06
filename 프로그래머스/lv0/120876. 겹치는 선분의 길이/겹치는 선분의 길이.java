import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        ArrayList list_one = new ArrayList();
        ArrayList list_two = new ArrayList();
        ArrayList list_three = new ArrayList();

        for(int i = lines[0][0];i<lines[0][1];i++){
            list_one.add(i);
        }
        for(int i = lines[1][0];i<lines[1][1];i++){
            list_two.add(i);
        }
        for(int i = lines[2][0];i<lines[2][1];i++){
            list_three.add(i);
        }
        int compare_size_list = list_one.size()+list_two.size()+list_three.size();
        
        
        Set<Integer> set_one = new HashSet<>(list_one);
        Set<Integer> set_two = new HashSet<>(list_two);
        Set<Integer> set_three = new HashSet<>(list_three);
        
        Set<Integer> set_one_sum = new HashSet<>(set_one);
        Set<Integer> set_two_sum = new HashSet<>(set_two);
        Set<Integer> set_three_sum = new HashSet<>(set_three);
        
        set_one_sum.addAll(set_two_sum);
        set_one_sum.addAll(set_three_sum);
   
        set_one.retainAll(set_two);
        set_one.retainAll(set_three);
        
        return compare_size_list - set_one_sum.size() - set_one.size();
    }
}