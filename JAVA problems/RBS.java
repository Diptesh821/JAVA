public class RBS {
    public static void main(String[] args) {
        int [] arr={4,5,6,0,1,2,3};
        System.out.println(findpivot(arr));
        int target=5;
        int k=Search(arr,target);
        System.out.println(k);

    }

    private static int Search(int[] arr, int target) {
        int pivot = findpivot(arr);
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

         static int findpivot( int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = (start) + (end - start) / 2;
                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }
                if (arr[mid] <= arr[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;

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




