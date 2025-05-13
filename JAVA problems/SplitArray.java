public class SplitArray {
    public static  int splitarray(int []nums,int m){
        int start=0;
        int end=0;
        for(int i=0;i< nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        //apply binary search
        while(start<end) {
            int mid = start + (end - start) / 2;
            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    //you cannot add this in this sub array. make a new one.
                    sum = num;
                    pieces++;

                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
        }

    public static void main(String[] args) {
        int arr[]={7,2,5,10,8};
        int m=2;
        int ans=splitarray(arr,2);
        System.out.println(ans);
    }
    }

