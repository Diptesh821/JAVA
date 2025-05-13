public class Q1 {
    static void rev(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        rev(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        rev(5);

    }
}
