import tasks.Task1;
import tasks.Task2;
import tasks.Task3;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("\n╔══════════════════════════════════════╗");
            System.out.println("║         ВЫБЕРИТЕ ЗАДАЧУ               ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║  1. Массив: min, max, среднее         ║");
            System.out.println("║  2. Повторяющийся символ в «Hello»    ║");
            System.out.println("║  3. Конвертер температур              ║");
            System.out.println("║  0. Выход                             ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print("Ваш выбор: ");

            String input = scanner.nextLine().trim();

            switch (input)
            {
                case "1" -> Task1.run();
                case "2" -> Task2.run();
                case "3" -> Task3.run();
                case "0" ->
                {
                    System.out.println("До свидания!");
                    return;
                }
                default -> System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
