package tasks;

import java.util.Scanner;

public class Task1
{
    public static void run()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Задача 1: Массив случайных чисел ---");
        System.out.print("Введите размер массива: ");

        int size;
        try
        {
            size = Integer.parseInt(scanner.nextLine().trim());
            if (size <= 0)
            {
                System.out.println("Размер должен быть больше 0");
                return;
            }
            else if (size>Integer.MAX_VALUE - 8)
            {
                System.out.println("Размер слишкм большой");
                return;
            }

        } catch (NumberFormatException e)
        {
            System.out.println("Некорректный ввод.");
            return;
        }

        double[] array = new double[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = Math.random() * 100;
        }

        double min = array[0];
        double max = array[0];
        double sum = 0;

        for (double v : array)
        {
            if (v < min) min = v;
            if (v > max) max = v;
            sum += v;
        }

        double avg = sum / size;

        System.out.print("Массив: [");
        for (int i = 0; i < size; i++)
        {
            System.out.printf("%.2f%s", array[i], i < size - 1 ? "| " : "");
        }

        System.out.println("]");

        System.out.printf("Минимальное: %.2f%n", min);
        System.out.printf("Максимальное: %.2f%n", max);
        System.out.printf("Среднее: %.2f%n", avg);
    }
}
