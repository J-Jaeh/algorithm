class Solution {
    public String longestCommonPrefix(String[] strs) {

        //일단 가장 짧은 길이 획득후 하나 하나 하나 비교 ? or 역으로 비교 ?
        int minStrLen = 200;
        for (String str : strs) {
            if (str.length()<minStrLen) minStrLen=str.length();
        }
        String ans ="";
        boolean flag=true;
        for (int i =0;i<minStrLen;i++){
            char temp = strs[0].toCharArray()[i];
            for (int j=1; j< strs.length;j++){
                if (temp != strs[j].toCharArray()[i]){
                    flag=false;  
                    break;
                }
            }
            if (flag){
                ans+=temp;
            }
        }
        
        return ans;
    }
}