package tasks;

import java.util.Scanner;

public class Task4 {

    public static double calculateAngle(int hours, int minutes) {
        hours = hours % 12;

        double minuteAngle = minutes * 6.0;

        double hourAngle = hours * 30.0 + minutes * 0.5;

        double angle = Math.abs(hourAngle - minuteAngle);

        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle;
    }

    public static void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Задача 4: Угол между стрелками часов ---");

        System.out.print("Введите часы (0–23): ");
        int hours;
        try {
            hours = Integer.parseInt(scanner.nextLine().trim());
            if (hours < 0 || hours > 23) {
                System.out.println("Часы должны быть в диапазоне 0–23.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод.");
            return;
        }

        System.out.print("Введите минуты (0–59): ");
        int minutes;
        try {
            minutes = Integer.parseInt(scanner.nextLine().trim());
            if (minutes < 0 || minutes > 59) {
                System.out.println("Минуты должны быть в диапазоне 0–59.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод.");
            return;
        }

        double angle = calculateAngle(hours, minutes);

        System.out.printf("Время: %02d:%02d%n", hours, minutes);
        System.out.printf("Угол между стрелками: %.1f°%n", angle);
    }
}
