package easy;

import java.util.Scanner;

public class JavaDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i = 0; i < t; i++){
            try {
                long x = scanner.nextLong();
                System.out.println(x + " can be fitted in:");
                if(x >= -128 && x <= 127) System.out.println("* byte");
                if(x >= -32768 && x <= 32767) System.out.println("* short");
                if(x >= -2147483648 && x <= 2147483647) System.out.println("* int");
                if(x >= -9223372036854775808L && x <= 9223372036854775807L) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}

/*
    O codigo acima tem a função de verificar quais tipos de dados primitivos em Java podem armazenar um número inteiro fornecido pelo usuário.
    Ele lê um número inteiro 't' que representa a quantidade de números a serem testados. 
    Para cada número, ele tenta ler um valor do tipo 'long' e verifica se ele se encaixa nos intervalos dos tipos de dados primitivos: byte, short, int e long. 
    Se o número não puder ser armazenado em nenhum desses tipos, ele captura a exceção e imprime uma mensagem indicando que o número não pode ser 
    armazenado em nenhum tipo de dado primitivo.

    Um byte é um tipo de dado primitivo em Java que pode armazenar valores inteiros de -128 a 127. Ele ocupa 1 byte (8 bits) de memória.
    Um short é um tipo de dado primitivo em Java que pode armazenar valores inteiros de -32768 a 32767. Ele ocupa 2 bytes (16 bits) de memória.
    Um int é um tipo de dado primitivo em Java que pode armazenar valores inteiros de -2147483648 a 2147483647. Ele ocupa 4 bytes (32 bits) de memória.
    Um long é um tipo de dado primitivo em Java que pode armazenar valores inteiros de -9223372036854775808 a 9223372036854775807. Ele ocupa 8 bytes (64 bits) de memória.

    Um byte é 8 bits, ou seja, 2^8 = 256 valores possíveis (de -128 a 127)
    Um short é 16 bits, ou seja, 2^16 = 65536 valores possíveis (de -32768 a 32767)
    Um int é 32 bits, ou seja, 2^32 = 4294967296 valores possíveis (de -2147483648 a 2147483647)
    Um long é 64 bits, ou seja, 2^64 = 18446744073709551616 valores possíveis (de -9223372036854775808 a 9223372036854775807)
*/
