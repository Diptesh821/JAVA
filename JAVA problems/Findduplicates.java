public class Findduplicates {
//    static int findduplicate(int[] arr){
//        int i=0;
//        while (i<arr.length){
//            int correct=arr[i]-1;
//            if(arr[i]!=arr[correct]){
//                swap(arr,i,correct);
//            }
//            else {
//                i++;
//            }
//        }
//        for(int index=0;index<arr.length;index++){
//            if(arr[index]!=index+1){
//                return arr[index];
//            }
//        }
//        return -1;
//
//
//    }
            static int findduplicate(int[] arr) {
                int i=0;
                while(i<arr.length){
                    if(arr[i]!=i+1){
                        int correct=arr[i]-1;
                        if(arr[i]!=arr[correct]){
                            swap(arr,i,correct);
                        }
                        else{
                            return arr[i];
                        }
                    }
                    else {
                        i++;
                    }
                }
                return -1;


            }
    static void swap(int [] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        int [] arr={2,1,3,4,3};
        int ans=findduplicate(arr);
        System.out.println(ans);
    }
}
