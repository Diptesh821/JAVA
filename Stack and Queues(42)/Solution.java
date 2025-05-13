// User function Template for Java
import java.util.*;
public class Solution {
    public static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> l=new ArrayList<>();
        l.add((long)1);
        for(long i=2;i<=n;i++){
            long m=i;
            while(m>0){
                long product=1;
                for(long j=2;j<=m;j++){
                    product=product*j;
                }
                if(product==i){
                    l.add(i);
                }
                m=m-1;
            }
        }
        return l;
    }

    public static void main(String[] args) {

        ArrayList<Long> l=factorialNumbers(120);
        System.out.println(l);

    }
}