import java.util.ArrayList;
//Q4 is done in Q3
public class Q5 {
    static ArrayList<Integer> findAllIndex(int []arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
       ArrayList<Integer> ansFromBelowCalls= findAllIndex(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,4,4,5};
        System.out.println(findAllIndex(arr,4,0));
    }
}
