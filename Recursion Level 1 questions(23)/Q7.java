public class Q7 {
    public static void main(String[] args) {
        System.out.println(palindrome(2112));
    }
    static boolean palindrome(int n){
        return n==reverse(n);
    }
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

}
