import java.util.ArrayList;
//Q4 is done in Q3
public class Q3 {
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int arr[], int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);


    }
    static ArrayList<Integer> findAllIndex1(int arr[], int target, int index,ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex1(arr, target, index + 1,list);


    }


    public static void main(String[] args) {
//        int[] arr={2,3,1,4,4,5};
//        findAllIndex(arr,4,0);
//        System.out.println(list);





        int[] arr={2,3,1,4,4,5};
//        System.out.println(findAllIndex1(arr,4,0,new ArrayList<>()));

//        ArrayList<Integer> ans=findAllIndex1(arr,4,0,new ArrayList<>());
//        System.out.println(ans);

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans1=findAllIndex1(arr,4,0,list);
        System.out.println(list);
        System.out.println(ans1);
    }
}
