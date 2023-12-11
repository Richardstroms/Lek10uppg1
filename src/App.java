import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    System.out.print("Ange ditt namn: ");
        String namn = scan.nextLine();

    System.out.print("Ange ditt lösenord: ");
        String lösenord = scan.nextLine();

    if (namn.equals("root") && lösenord.equals("pass")) {
            System.out.println("Ditt bankkonto har 0 kr");
    } else {
            System.out.println("Fel namn eller lösenord");
        }

        scan.close();
    }
}
