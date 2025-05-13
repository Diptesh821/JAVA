import java.util.ArrayList;

public class DiceFace {
    static void diceFace(String p,int target,int face){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i=1;i<=face && i<=target;i++){
            diceFace(p+i,target-i,face);
        }
    }

    public static void main(String[] args) {
        diceFace("",8,8);
    }
}
