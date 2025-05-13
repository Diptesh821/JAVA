import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int emp=sc.nextInt();
        String dept=sc.next();
        switch (emp) {
            case 1 -> System.out.println("piku");
            case 2 -> System.out.println("hari");
            case 3 -> {
                System.out.println("chandran");
                switch (dept) {
                    case "IT" -> System.out.println("IT");
                    case "manage" -> System.out.println("manage");
                    default -> System.out.println("x");
                }
            }
            default -> System.out.println("no");
        }
    }
}
