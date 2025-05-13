import java.util.ArrayList;

public class PhonePad {
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char) ('a'+i);
            pad(p+ch,up.substring(1));
        }
    }
    static void pad1(String p,String up,ArrayList<String > list){
        if(up.isEmpty()){
           list.add(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char) ('a'+i);
            pad1(p+ch,up.substring(1),list);
        }
    }
    static ArrayList<String> padRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char) ('a'+i);
           list.addAll(padRet(p+ch,up.substring(1))) ;
        }
        return list;
    }

    public static void main(String[] args) {
//        pad("","12");


//        ArrayList<String> list1=new ArrayList<>();
//        pad1("","12",list1);
//        System.out.println(list1);



        ArrayList<String> list=padRet("","12");
        System.out.println(list);
        System.out.println(padRet("","12"));
        System.out.println(list.size());

        System.out.println(padCount("","12"));

    }
    static int padCount(String p,String up){
        if(up.isEmpty()){

            return 1;
        }
        int count=0;
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char) ('a'+i);
           count=count+ padCount(p+ch,up.substring(1));
        }
        return count;
    }
}
