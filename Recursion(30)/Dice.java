import java.util.ArrayList;

public class Dice {
    static void dice(String p,int target,ArrayList<String> list){
        if(target==0){
            list.add(p);
            return;
        }
        for (int i=1;i<=6 && i<=target;i++){
            dice(p+i,target-i,list);
        }
    }
    static void dice1(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i=1;i<=6 && i<=target;i++){
            dice1(p+i,target-i);
        }
    }
    static ArrayList<String> diceRet(String p,int target){
        if(target==0){
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
            return list;
        }
        ArrayList<String > list=new ArrayList<>();
        for (int i=1;i<=6 && i<=target;i++){
            list.addAll(diceRet(p+i,target-i));
        }
        return list;
    }

    public static void main(String[] args) {
//        ArrayList<String> list=new ArrayList<>();
//        dice("",4,list);
//        System.out.println(list);



//        dice1("",4);



        ArrayList<String> list=diceRet("",4);
        System.out.println(list);

    }
}
