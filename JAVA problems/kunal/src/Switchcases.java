import java.util.Scanner;

public class Switchcases {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit =sc.nextLine();
        switch (fruit) {
            case "mango":
                System.out.println("m");
                break;
            case "apple":
                System.out.println("a");
                break;
            case "orange":
                System.out.println("o");
                break;
            default:
                System.out.println("X");
                break;
        }
    }
}
