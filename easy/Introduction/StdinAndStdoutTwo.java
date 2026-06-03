package easy.Introduction;

import java.util.Scanner;

public class StdinAndStdoutTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        double b = scan.nextDouble();
        scan.nextLine(); // Consume the remaining newline
        String c = scan.nextLine();

        System.out.println(c);
        System.out.println(b);
        System.out.println(a);

        scan.close();
    }
}