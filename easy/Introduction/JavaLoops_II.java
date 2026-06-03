package easy.Introduction;

import java.util.Scanner;

public class JavaLoops_II {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int result = a;
            int potencia = 1;

            for(int j = 0; j < n; j++) {
                result += potencia * b;
                System.out.print(result + " ");
                potencia *= 2;
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*
    Formula matematica desse calculo
    Primeiro Termo: j = 0 -> a + (2^0 * b) = a + b
    Segundo Termo: j = 1 -> a + (2^0 * b) + (2^1 * b) = a + b + 2b = a + 3b
    Terceiro Termo: j = 2 -> a + (2^0 * b) + (2^1 * b) + (2^2 * b) = a + b + 2b + 4b = a + 7b
     .
     .
     .
*/
