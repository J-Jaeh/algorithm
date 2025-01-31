import java.util.HashSet;

public class Solution {
  
    public  int solution(int[] elements) {
        int[] exElements = new int[elements.length*2];

        for(int i=0;i<elements.length*2;i++){
            exElements[i]=elements[i%elements.length];
        }

        HashSet<Integer> set = new HashSet<>();

        for(int lens=1;lens<elements.length+1;lens++){
            int sum=0;
            for(int i =0;i<lens;i++){
                sum+=exElements[i];
            }
            set.add(sum);
            for(int j=1;j<elements.length;j++){
                // 7 9 1 1 4 
//                System.out.println(sum+" : "+ (j-1) + "   -----     "+ (lens+j-1));
                sum=sum-exElements[j-1]+exElements[lens+j-1];
                set.add(sum);
            }
        }
        return set.size();
    }
}
