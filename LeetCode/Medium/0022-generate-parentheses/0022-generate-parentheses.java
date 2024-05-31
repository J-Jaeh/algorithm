class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
//        StringBuilder str = new StringBuilder();

        recur(ans,"(",n-1,n);

        return ans;
    }

    private  void recur(List<String> ans,String str,int open,int close){
        if (open==0 && close ==0){
            ans.add(str);
//            str.delete(0,str.length());
            return;
        }

        if (open>0) recur(ans,str+"(",open-1,close);

        if(open<close) recur(ans, str+")", open, close-1);
    }
}