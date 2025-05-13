public class Q10 {
    public static void main(String[] args) {
        int n=6;
        int count=0;
        while(n>0){
            n=n>>1;
            count++;
        }
        System.out.println(count);

        //Another way
        int num=34567;
        int b=10;
        int ans=(int)(Math.log(num)/Math.log(b))+1;
        System.out.println(ans);
    }

}
