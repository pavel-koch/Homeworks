public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s, ", i);
        }

        // Задание 2
        System.out.printf("\n\nЗадание 2\n");
        for (int i = 10; i > 0; i--) {
            System.out.printf("%s, ", i);
        }

        // Задание 3
        System.out.printf("\n\nЗадание 3\n");
        for (int i = 0; i <= 17; i += 2) {
            System.out.printf("%s, ", i);
        }

        // Задание 4
        System.out.printf("\n\nЗадание 4\n");
        for (int i = 10; i >= -10; i--) {
            System.out.printf("%s, ", i);
        }

        // Задание 5
        System.out.printf("\n\nЗадание 5\n");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.printf("%s год является високосным\n", i);
        }

        // Задание 6
        System.out.printf("\nЗадание 6\n");
        for (int i = 7; i <= 98; i += 7) {
            System.out.printf("%s, ", i);
        }

        // Задание 7
        System.out.printf("\n\nЗадание 7\n");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.printf("%s, ", i);
        }

        // Задание 8
        System.out.printf("\n\nЗадание 8\n");
        double amountOfSavings = 0;
        double monthlyContribution = 29000;
        for (int i = 1; i <= 12; i ++) {
            amountOfSavings += monthlyContribution;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", i, amountOfSavings);
        }

        // Задание 9
        System.out.printf("\n\nЗадание 9\n");
        amountOfSavings = 0;
        double percent = 1.01;
        for (int i = 1; i <= 12; i ++) {
            amountOfSavings *= percent;
            amountOfSavings += monthlyContribution;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей\n", i, amountOfSavings);
        }

        // Задание 10
        System.out.printf("\n\nЗадание 10\n");
        for (int i = 1, a = 2, b = 0; i <= 10; i ++) {
            b = a * i;
            System.out.printf("%s * %s = %s\n", a, i, b);
        }
    }
}