import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int y_len=maps.length;
        int x_len=maps[0].length;
        boolean[][] vi = new boolean[y_len][x_len];
        vi[0][0]=true;
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        Deque<Node> q = new ArrayDeque<>();
        q.add(new Node(0,0,1));
        while(!q.isEmpty()){
           Node dot  = q.pollFirst();
           int o_y = dot.y;
           int o_x = dot.x;
           
           if (o_y==y_len-1 && o_x == x_len -1){
                return dot.dist;
           }
           for(int i =0;i<4;i++){
            int n_y = o_y + dy[i];
            int n_x = o_x + dx[i];
            
            if (0<=n_y && 0<=n_x && n_y<y_len && n_x<x_len&&maps[n_y][n_x]==1&&!vi[n_y][n_x]){
            vi[n_y][n_x]=true;
            q.add(new Node(n_x,n_y,dot.dist+1));
            }
           }
           
           
           
        }
        
        return -1;
    }
    
    private class Node{
        int x;
        int y;
        int dist;
        public Node(int x, int y, int dist){
            this.x=x;
            this.y=y;
            this.dist=dist;
        }
    }
}