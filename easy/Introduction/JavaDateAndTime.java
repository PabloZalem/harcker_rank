package easy.Introduction;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class JavaDateAndTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        // Cria a data
        LocalDate date = LocalDate.of(year, month, day);

        // Obtém o dia da semana
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Imprime em maiúsculas
        System.out.println(dayOfWeek.toString());

        sc.close();
    }
}
