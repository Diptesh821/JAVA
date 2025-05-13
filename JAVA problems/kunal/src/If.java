import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit =sc.nextLine();
        if(fruit.equals("Mango")){
            System.out.println("m");
        }
        else if (fruit.equals("orange")){
            System.out.println("o");
        }
    }
}
