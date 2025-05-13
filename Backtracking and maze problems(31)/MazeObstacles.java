public class MazeObstacles {
    static void pathRestictions(String p,boolean[][]maze,int r,int c){
        if(r== maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if (r< maze.length-1){
            pathRestictions(p+"D",maze,r+1,c);
        }
        if (c<maze[0].length-1){
            pathRestictions(p+'R',maze,r,c+1);
        }

    }
    static void allPaths(String p,boolean[][] maze,int r,int c){
        if(r== maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if (r< maze.length-1){
            allPaths(p+'D',maze,r+1,c);
        }
        if (c<maze[0].length-1){
            allPaths(p+'R',maze,r,c+1);
        }
        if(r>0){
            allPaths(p+'U',maze,r-1,c);
        }
        if (c>0){
            allPaths(p+'L',maze,r,c-1);
        }
        maze[r][c]=true;

    }

    public static void main(String[] args) {
        boolean [][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
//        pathRestictions("",board,0,0);

        allPaths("",board,0,0);
    }
}
