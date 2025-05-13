public class OddEven {
    public static void main(String[] args) {
        int n=68;
        if (isOdd(n)){
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }
    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }
}
