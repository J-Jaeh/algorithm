class Solution {
    public int[][] merge(int[][] intervals) {
        //자바에서 2차원 배열 기준 정렬
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));

        ArrayList<int[]> ans = new ArrayList<>();

        int[] temp = intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(temp[1]>=intervals[i][0]){
                if(temp[1]<intervals[i][1])
                    temp[1]=intervals[i][1];
            }else{
                ans.add(temp);
                temp=intervals[i];
            }
        }
        ans.add(temp);
        
        int[][] return_ans = new int[ans.size()][2];
        
        for(int i=0;i<ans.size();i++){
            return_ans[i][0]=ans.get(i)[0];
            return_ans[i][1]=ans.get(i)[1];
        }
        return return_ans;
    }
}
