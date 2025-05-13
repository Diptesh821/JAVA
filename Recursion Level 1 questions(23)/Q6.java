public class Q6 {
    static int reverse(int n){
        int noofdigits=(int)(Math.log10(n))+1;
       return helper(n,noofdigits-1);
    }
    static int helper(int n,int c){
        if(n%10==n){
            return n;
        }
        return (n%10)*(int)(Math.pow(10,c))+helper(n/10,c-1);
    }



    static int sum=0;
    static void reverse2(int n){
        if(n==0){
            return;
        }
        sum= 10*sum+(n%10);

        reverse2(n/10);
    }
    public static void main(String[] args) {
        reverse2(1234);
        System.out.println(sum);



    }
}
