import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int solution(int[][] maps) {
        int y_len = maps.length;
        int x_len = maps[0].length;

        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,-1,1};

        boolean[][] vi = new boolean[y_len][x_len];

        Deque<Node> q = new ArrayDeque<>();
        int dist = 1;

        q.add(new Node(0,0,dist));
        vi[0][0]=true;
        while (!q.isEmpty()){
            Node node = q.pollFirst();
            int o_x =node.x;
            int o_y =node.y;
            if (o_x == x_len-1 && o_y== y_len-1){
                return node.dist;
            }

                for(int i=0;i<4;i++){
                    int n_x = o_x+dx[i];
                    int n_y = o_y+dy[i];
                    if(0<=n_y&&0<=n_x&&n_y<y_len&&n_x<x_len&&!vi[n_y][n_x]&&maps[n_y][n_x]==1){
                        vi[n_y][n_x]=true;
                        q.add(new Node(n_x,n_y,node.dist+1));
                    }
                }
        }

        return -1;
    }

    private class Node{
        int x;
        int y;
        int dist;
        public Node(int x, int y,int dist) {
            this.x = x;
            this.y = y;
            this.dist=dist;
        }
    }
}
