import java.util.HashSet;

public class Solution {
  
    public  int solution(int[] elements) {
        int[] exElements = new int[elements.length*2];

        for(int i=0;i<elements.length*2;i++){
            exElements[i]=elements[i%elements.length];
        }

        HashSet<Integer> set = new HashSet<>();

        for(int lens=1;lens<elements.length+1;lens++){
            for(int i=0;i<elements.length;i++){
                int n=0;
                for(int j=i;j<i+lens;j++){
                    n+=exElements[j];
                }
                set.add(n);
            }
        }
        return set.size();
    }
}
