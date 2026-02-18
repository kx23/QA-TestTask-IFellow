package tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task2
{
    public static void run()
    {
        System.out.println("\n--- Задача 2: Повторяющийся символ в слове «Hello» ---");

        String word = "Hello";
        System.out.println("Слово: " + word);

        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : word.toLowerCase().toCharArray())
        {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Статистика символов:");
        for (Map.Entry<Character, Integer> entry : charCount.entrySet())
        {
            System.out.printf("  '%c' — %d раз%n", entry.getKey(), entry.getValue());
        }

        System.out.print("Повторяющиеся символы: ");
        boolean found = false;
        for (Map.Entry<Character, Integer> entry : charCount.entrySet())
        {
            if (entry.getValue() > 1)
            {
                System.out.printf("'%c' (%d раза)  ", entry.getKey(), entry.getValue());
                found = true;
            }
        }
        if (!found)
        {
            System.out.print("не найдено");
        }
        System.out.println();
    }
}
