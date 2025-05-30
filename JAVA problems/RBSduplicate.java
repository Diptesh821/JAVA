public class RBSduplicate {
    public static void main(String[] args) {

        int[] arr={2,9,2,2,2};
        System.out.println(findpivotwithduplicate(arr));
        int target=2;
        int k=Search(arr,target);
        System.out.println(k);
    }
    static int findpivotwithduplicate(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            //if elements at middle,start,end are equal then skip the duplicates.
            if (arr[mid]==arr[start]&&arr[mid]==arr[end]){
          if(arr[start]>arr[start+1]){
              return start;
          }
          start++;
          if(arr[end]<arr[end-1]){
              return end-1;
          }
          end--;
        } else if (arr[start]<arr[mid]||(arr[start]==arr[mid]&&arr[mid]>arr[end])){
            start=mid+1;
            }
            else{
                end=mid-1;
            }

            }
        return -1;


        }
    private static int Search(int[] arr, int target) {
        int pivot = findpivotwithduplicate(arr);
        if (pivot == -1) {

            return binarysearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        } else if (target>=arr[0]) {
            return binarysearch(arr,target,0,pivot);

        }

        return binarysearch(arr,target,pivot+1,arr.length-1);

    }
    static int binarysearch(int [] arr,int target,int start,int end){


        while(start<=end){
            int mid=(start)+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;

            } else if (target<arr[mid]) {
                end=mid-1;

            }
            else return mid;
        }
        return -1;
    }
}
