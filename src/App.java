import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppgift A");

        Scanner tal = new Scanner(System.in);
        System.out.print("Ange tal 1: ");
        int tal1 = tal.nextInt();

        System.out.print("Ange tal 2: ");
        int tal2 = tal.nextInt();

        double kvot = (double)tal1/(double)tal2;
        System.out.println("Kvoten är "+kvot);

        int kvot2=(int)tal1/(int)tal2;
        System.out.println("Kvoten är: "+kvot2);
    }
}
