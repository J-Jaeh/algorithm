class Solution {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int c1Index=0;
        int c2Index=0;
        for (String s : goal) {
//            System.out.println(s);
            if(cards1.length>c1Index && s.equals(cards1[c1Index])){
                c1Index++;
            } else if (cards2.length>c2Index && s.equals(cards2[c2Index])) {
                c2Index++;
            }else{
                answer="No";
                break;
            }
        }
        return answer;
    }
}