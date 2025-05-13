public class Q14 {
    public static void main(String[] args) {
        int n=9;
        int count=0;
        while (n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;

        }
        System.out.println(count);



        //Another way
        int num=10;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(setBits(num));
    }
    static int setBits(int n){
        int count1=0;
        while(n>0){
            count1++;
            n=n&(n-1);

        }
        return count1;
    }
}
