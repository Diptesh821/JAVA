public class HappyNumber {

    public boolean isHappy(int n){
        int slow=n;
        int fast=n;
        do  {
            slow = squareNumber(slow);
            fast = squareNumber(squareNumber(fast));

            if (fast==1){
                return true;
            }

        }
        while (slow!=fast);
        return false;



    }

    private int squareNumber(int n){
        int c=0;
        while (n>0){
            int temp=n%10;
            c+=(temp*temp);
            n=n/10;
        }
        return c;
    }

    public static void main(String[] args) {
        HappyNumber h=new HappyNumber();
        System.out.println(h.isHappy(12));



    }
}
