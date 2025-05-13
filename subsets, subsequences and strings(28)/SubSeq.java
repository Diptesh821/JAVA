import java.util.ArrayList;

public class SubSeq {
    static void subSeq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));
    }
    static ArrayList<String> list=new ArrayList<>();
    static void subSeq1(String p,String up){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        char ch=up.charAt(0);
        subSeq1(p+ch,up.substring(1));
        subSeq1(p,up.substring(1));
    }

    public static void main(String[] args) {
//        subSeq("","abc");


//        subSeq1("","abc");
//        System.out.println(list);


        System.out.println(subSeqRet("","abc"));

    }
    static ArrayList<String> subSeqRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String > list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
       ArrayList<String> left= subSeqRet(p+ch,up.substring(1));
        ArrayList<String> right=subSeqRet(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
