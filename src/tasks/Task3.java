package tasks;

import java.util.Scanner;

public class Task3 {

    static abstract class BaseConverter {
        protected double celsius;

        public BaseConverter(double celsius) {
            this.celsius = celsius;
        }

        public abstract double convert();
        public abstract String getUnitName();
    }

    static class CelsiusToKelvin extends BaseConverter {
        public CelsiusToKelvin(double celsius) {
            super(celsius);
        }

        @Override
        public double convert() {
            return celsius + 273.15;
        }

        @Override
        public String getUnitName() {
            return "Кельвины (K)";
        }
    }

    static class CelsiusToFahrenheit extends BaseConverter {
        public CelsiusToFahrenheit(double celsius) {
            super(celsius);
        }

        @Override
        public double convert() {
            return celsius * 9.0 / 5.0 + 32;
        }

        @Override
        public String getUnitName() {
            return "Фаренгейты (°F)";
        }
    }

    public static void run() {
        System.out.println("\n--- Задача 3: Конвертер температур ---");
        System.out.print("Введите температуру в градусах Цельсия: ");

        Scanner scanner = new Scanner(System.in);

        double celsius;
        try {
            celsius = Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод.");
            return;
        }

        System.out.println("Выберите единицу конвертации:");
        System.out.println("  1. Кельвины");
        System.out.println("  2. Фаренгейты");
        System.out.print("Ваш выбор: ");

        String choice = scanner.nextLine().trim();

        BaseConverter converter;
        switch (choice) {
            case "1" -> converter = new CelsiusToKelvin(celsius);
            case "2" -> converter = new CelsiusToFahrenheit(celsius);
            default -> {
                System.out.println("Неверный выбор.");
                return;
            }
        }

        double result = converter.convert();
        System.out.printf("%.2f °C = %.2f %s%n", celsius, result, converter.getUnitName());
    }
}
