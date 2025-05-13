public class Q1 {
    static boolean sorted(int [] arr,int c){
        if(c== arr.length-1){
            return true;
        }
        return arr[c]<arr[c+1]&&sorted(arr,c+1);

    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(sorted(arr,0));
    }
}
