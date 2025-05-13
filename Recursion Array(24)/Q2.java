public class Q2 {
    public static void main(String[] args) {
        int arr[]={2,3,1,4,4,5};
        System.out.println(findIndexLast(arr,4,5));
        System.out.println(findIndex(arr,4,0));

    }
    static int findIndex(int arr[],int target,int index){
        if(index== arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr,target,index+1);
        }



    }
    static boolean findIndexboolean(int arr[],int target,int index){
        if(index== arr.length){
            return false;
        }
        if(arr[index]==target){
            return true;
        }
        else{
            return findIndexboolean(arr,target,index+1);
        }



    }
    static int findIndexLast(int arr[],int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndexLast(arr,target,index-1);
        }
    }
}
