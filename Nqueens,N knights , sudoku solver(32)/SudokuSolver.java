public class SudokuSolver {
    static boolean isSafe(int [][]board,int row,int col,int num){
        for (int i=0;i<board.length;i++){
            //check if the number is in the row
            if(board[row][i]==num){
                return false;
            }
        }
        //chack the column
        for (int[]nums:board){
            //check is the number is in the col
            if (nums[col]==num){
                return false;
            }
        }
        int sqrt=(int) (Math.sqrt(board.length));
        int rowStart=row-row%sqrt;
        int colStart=col-col%sqrt;
        for (int r=rowStart;r<rowStart+sqrt;r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if (board[r][c] == num){
                    return false;
                }
            }
        }
        return true;

    }
    static boolean solve(int[][]board){
        int n= board.length;
        int row=-1;
        int col=-1;
        boolean emptyLeft=true;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (board[i][j]==0){
                    row=i;
                    col=j;
                    emptyLeft=false;
                    break;
                }
            }
            if (emptyLeft==false){
                break;
            }
        }
        if (emptyLeft==true){
            return true;
        }
        for (int number=1;number<=9;number++){
            if (isSafe(board,row,col,number)){
                board[row][col]=number;
                if (solve(board)){
//                    display(board);
//                    System.out.println();
                    return true;
                }
                else {
                    board[row][col]=0;
                }
            }

        }
        return false;
    }
    static void display(int [][] board){
        for (int [] row:board){
            for (int num:row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] board=new int[][]{
                {0,1,9,0,0,0,0,0,2},
                {0,0,7,0,0,0,0,0,9},
                {0,0,0,0,0,0,8,3,5},
                {0,0,0,2,0,0,0,8,0},
                {4,0,6,1,0,0,0,0,0},
                {0,0,0,0,9,0,4,0,0},
                {9,0,0,0,3,5,0,0,0},
                {0,5,0,0,0,8,2,0,0},
                {0,3,0,0,0,0,0,0,0}

        };

        //to print only one answer
        if (solve(board)){
            display(board);
        }
        else {
            System.out.println("can not solve");
        }




        //to print all the possible answers
//        System.out.println(solve(board));




    }
}
