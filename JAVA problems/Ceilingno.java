public class Ceilingno {
        static int ceiling(int arr[],int target){
            int start=0;
            int end= arr.length-1;
            if(target> arr[arr.length-1]){
                return -1;
            }
            while(start<=end){
                int mid=(start)+(end-start)/2;
                if(target>arr[mid]){
                    start=mid+1;

                } else if (target<arr[mid]) {
                    end=mid-1;

                }
                else return mid;
            }
            return start;


    }
    public static void main(String[] args) {
        int [] arr={-18,-12,-4,0,2,3,4,15,18,22,45,89};
        int target=16;

        int ans1=ceiling(arr,target);
        System.out.println(ans1);
        System.out.println(arr[ans1]);

    }
}



