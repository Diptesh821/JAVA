public class counting {
    public static void main(String[] args) {
        int n=1385757879;
        int count=0;
        while (n>0){
            if (n%10==7){
                count++;

            }
            n=n/10;

        }
        System.out.println(count);
    }
}
