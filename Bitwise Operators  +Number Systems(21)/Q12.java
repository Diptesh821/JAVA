public class Q12 {
    public static void main(String[] args) {
        int count=0;
        int num=12;
        int n=num;
        while (num>0){
            if((num&1)==1){
                count++;
            }
            num=num>>1;

        }
       if(count==1){
           System.out.println(n+"is a power of 2");
       }
       else {
           System.out.println(n+"is not a power of 2");
       }

       //Another way(simpler)
        int no=16;
       boolean ans=(no&(no-1))==0;
        if((ans)&&(no!=0)){
            System.out.println(no+"is power of 2");

        }
        else{
            System.out.println(no+"is not a power of 2");
        }

    }
}
