class Solution {
//    int[][] visited;
    char[][] new_grid;
    int x_len;
    int y_len;

    int[] dx={-1,0,1,0};
    int[] dy={0,-1,0,1};

    public int numIslands(char[][] grid) {
        x_len= grid[0].length;
        y_len= grid.length;
        new_grid=grid;
//        visited= new int[y_len][x_len];

        int count_islands=0;
        
        for(int i =0;i<y_len;i++){
            for(int j=0;j<x_len;j++){
                if(new_grid[i][j] =='1'){
                    bfs(j,i);
                    count_islands++;
                }
            }
        }
        return count_islands;
    }

    private void bfs(int x,int y){
        Node node = new Node(x,y);
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        new_grid[y][x]='0';

        while (!queue.isEmpty()){
            Node dot = queue.poll();
            for(int i=0;i<4;i++){
                int n_x = dot.getX() +dx[i];
                int n_y = dot.getY() +dy[i];

                if(0<=n_x && n_x<x_len && 0<=n_y && n_y<y_len && new_grid[n_y][n_x]=='1'){
                       new_grid[n_y][n_x]='0';
                       queue.add(new Node(n_x, n_y));
                   }
                }
            }
    }
    private class Node{
        private int x;
        private int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}