public class Mountain {
    static int peakindexinmountainarray(int [] arr){

        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid=(start)+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;

            } else {
                start=mid+1;

            }

        }
        return start;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,4,3,2};
        int ans=peakindexinmountainarray(arr);
        System.out.println(ans);
    }
}
