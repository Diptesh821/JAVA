public class pattern {
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//    static void pattern4(int n){
//        for(int row=1;row<=n;row++){
//            int count=1;
//            for(int col=1;col<=row;col++){
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }
//    }
    static void pattern4(int n){
        for(int row=1;row<=n;row++){

            for(int col=1;col<=row;col++){
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }
//    static void pattern5(int n){
//        for(int row=1;row<=2*n-1;row++){
//
//            if(row<=n) {
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//            else {
//                for (int col =1;col<=2*n-row;col++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//
//        }
//    }
    static void pattern5(int n){
        for(int row=1;row<=2*n-1;row++){

           int totalcolsinrow=row<=n?row:2*n-row;
           for(int col=1;col<=totalcolsinrow;col++){
               System.out.print("*");
           }

            System.out.println();
        }
    }
    static void pattern28(int n) {
        for (int row = 1; row <=2*n-1 ; row++) {

            int totalcolsinrow = (row >=n) ? 2 * n - row: row;
            int spaces=n-totalcolsinrow;
            for (int s=1;s<=spaces;s++){
                System.out.print(" ");
            }
            for (int col = 1; col <=totalcolsinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int row = 1; row <= 2 * n - 1; row++) {

            int c = (row >=n) ? 2 * n - row  : row;
            int spaces=n-c;
            for (int s=1;s<=spaces;s++){
                System.out.print("  ");
            }
            for (int col=c;col>=1;col--){
                System.out.print(col+" ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for (int row = 1; row <=  n ; row++) {


            for (int s=1;s<=n-row;s++){
                System.out.print("  ");
            }
            for (int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }


    }
//    static void pattern31(int n){
//        int oN=n;
//        n=2*n;
//        for (int row=0;row<=n;row++){
//            for(int col=0;col<=n;col++){
//                int ateveryindex=oN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
//                System.out.print(ateveryindex+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern31(int n){
//        int oN=n;
//        n=2*n;
//        for (int row=0;row<=n;row++){
//            for(int col=0;col<=n;col++){
//                int ateveryindex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
//                System.out.print(ateveryindex+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern31(int n){
//        int oN=n;
//        n=2*n;
//        for (int row=1;row<=n-1;row++){
//            for(int col=1;col<=n-1;col++){
//                int ateveryindex=(Math.min(Math.min(row-1,col-1),Math.min(n-row-1,n-col-1)))+1;
//                System.out.print(ateveryindex+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern31(int n){
//        int oN=n;
//        n=2*n;
//        for (int row=1;row<=n-1;row++){
//            for(int col=1;col<=n-1;col++){
//                int ateveryindex=Math.min(Math.min(row-1,col-1),Math.min(n-row-1,n-col-1));
//                System.out.print(ateveryindex+" ");
//            }
//            System.out.println();
//        }
//    }
    static void pattern31(int n){
        int oN=n;
        n=2*n;
        for (int row=1;row<=n-1;row++){
            for(int col=1;col<=n-1;col++){
                int ateveryindex=oN-Math.min(Math.min(row-1,col-1),Math.min(n-row-1,n-col-1));
                System.out.print(ateveryindex+" ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        pattern31(4);
    }


}

