import java.util.Arrays;
class Solution {
    public static int solution(int[] arr) {
        int startValue = Arrays.stream(arr).max().getAsInt();
        int plus=startValue;
        while (true){
            boolean flag = false;

            for (int i : arr) {
                   if ( startValue%i != 0){
                       flag=true;
                       break;
                   }
            }

            if(flag){
                startValue+=plus;
//                System.out.println(startValue+ " " + count);
            }else{
                break;
            }
        }

        return startValue;
    }
}