import java.util.ArrayList;

public class Permutations {
    static int permutationsCount(String p,String up,int c){
        if(up.isEmpty()){
            return c+1;
        }
        char ch=up.charAt(0);
        int count=0;
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count=count+  permutationsCount(f+ch+s,up.substring(1),c);
        }
        return count;
    }
    static int permutationsCount1(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        int count=0;
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count=count+  permutationsCount1(f+ch+s,up.substring(1));
        }
        return count;
    }
    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
             permutations(f+ch+s,up.substring(1));
        }

    }
    static ArrayList<String> permutations1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String > list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String > list=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            list.addAll(permutations1(f+ch+s,up.substring(1)));
        }
        return list;

    }


    public static void main(String[] args) {
        int c=permutationsCount("","abc",0);
        System.out.println(c);


        permutations("","abc");


        System.out.println(permutations1("","abc"));


        System.out.println(permutationsCount1("","abc"));




    }
}
