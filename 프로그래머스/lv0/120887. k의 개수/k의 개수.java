class Solution {
    public int solution(int i, int j, int k) {
        int count = 0;
        int startValue;
        int endValue = j;
        String replaceValue = "" + k;
        
        for (startValue = i; startValue < endValue + 1; startValue++) {
            String stringValue = "" + startValue;

            String minusValue = stringValue.replaceAll(replaceValue,"");

            count = count +(stringValue.length() -minusValue.length());

        }
        return count;
    }
}