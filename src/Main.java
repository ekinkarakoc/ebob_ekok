import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ebob = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1 sayisini giriniz");
        int n1 = scanner.nextInt();

        System.out.print("n2 sayisini giriniz");
        int n2 = scanner.nextInt();

        if (n1 < n2) {
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("EBOB: " + ebob);
            for (int k = n1; k >= 1; k--) {
                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;
                    System.out.println("ebob2 : " + ebob);
                    break;
                }
            }
        } else {
            for (int i = 1; i <= n2; i++) ;
        }
    }
}