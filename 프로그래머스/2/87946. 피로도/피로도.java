class Solution {
   public int solution(int k, int[][] dungeons) {
        return dfs(k,dungeons,new boolean[dungeons.length],0);
    }

    private int dfs(int nowK,int[][] dungeons ,boolean[] check, int depth ){
        int temp = depth;

        for (int i=0 ; i <dungeons.length;i++) {
            if(!check[i] && nowK>=dungeons[i][0]){
                check[i]=true;
               temp =  Math.max(temp,dfs(nowK-dungeons[i][1],dungeons,check,depth+1));
               check[i]=false;
            }
        }

        return temp;
    }
}