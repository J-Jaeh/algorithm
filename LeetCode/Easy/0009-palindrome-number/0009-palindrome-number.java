class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return  false;
        char[] toChar = Integer.toString(x).toCharArray();
        int size = toChar.length;
        int r=0;
        int l =size-1;
       while (r<l){
           if (toChar[r] == toChar[l]){
               r++;
               l--;
               continue;
           }else return false;
       }
        return true;
    }
}