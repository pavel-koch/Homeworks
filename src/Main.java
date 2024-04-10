public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.printf("\n\nЗадание 1\n");
        double amountOfSavings6 = 0;
        double monthlyContribution6 = 15000;
        double percent6 = 1.01;
        int month = 0;
        while (amountOfSavings6 < 2_459_000) {
            amountOfSavings6 *= percent6;
            amountOfSavings6 += monthlyContribution6;
            month++;
        }
        System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей\n", month, amountOfSavings6);

        // Задание 2
        System.out.printf("\n\nЗадание 2\n");
        int b = 1;
        System.out.printf("\nЦикл - while\n");
        while (b <= 10) {
            System.out.printf("%s ", b);
            b++;
        }
        System.out.printf("\nЦикл - for\n");
        for (b = 10; b > 0; b--) {
            System.out.printf("%s ", b);
        }

        // Задание 3
        System.out.printf("\n\nЗадание 3\n");
        long populationOfTheCountryY = 12_000_000L;
        int birthRate = 17;
        int mortality = 8;
        int populationGrowth = birthRate - mortality;
        for (int i = 1; i <= 10; i++) {
            populationOfTheCountryY += (populationOfTheCountryY / 1000) * populationGrowth;
            System.out.printf("Год %s, численность населения составляет %s\n", i, populationOfTheCountryY);
        }

        // Задание 4
        System.out.printf("\n\nЗадание 4\n");
        double amountOfSavings = 15000.00;
        double percent = 1.07;
        for (int i = 0; amountOfSavings <= 12_000_000; i++) {
            amountOfSavings *= percent;
            System.out.printf("Месяц %s, сумма накоплений составляет %.2f\n", i, amountOfSavings);

        }

        // Задание 5
        System.out.printf("\n\nЗадание 5\n");
        amountOfSavings = 15000.00;
        for (int i = 0; amountOfSavings <= 12_000_000; i++) {
            amountOfSavings *= percent;
            if (i % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений составляет %.2f\n", i, amountOfSavings);
            }

        }
        // Задание 6
        System.out.printf("\n\nЗадание 6\n");
        amountOfSavings = 15000.00;
        int time = 9 * 12;
        for (int i = 0; i <= time; i++) {
            amountOfSavings *= percent;
            if (i % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений составляет %.2f\n", i, amountOfSavings);
            }
        }

        // Задание 7
        System.out.printf("\n\nЗадание 7\n");
        int fridayDate = 1;
        int daysInMonth =31;
        for (int i = fridayDate; i <= daysInMonth; i++) {
            if ((i-fridayDate) % 7 == 0) {
                System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет\n", i);
            }
        }

        // Задание 7 вариант 2
        System.out.printf("\n\nЗадание 7 вариант 2\n");
        while (fridayDate<=31){
            System.out.printf("Сегодня пятница, %s-е число. Необходимо подготовить отчет\n", fridayDate);
            fridayDate += 7;
        }


        // Задание 8
        System.out.printf("\n\nЗадание 8\n");
        int thisYear = 2024;
        int startYear = thisYear - 200;
        int finishYear = thisYear + 100;
        for (int i = startYear; i <= finishYear; i++){
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }

/*
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
        for (int i = 1; i <= 12; i++) {
            amountOfSavings += monthlyContribution;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\n", i, amountOfSavings);
        }

        // Задание 9
        System.out.printf("\n\nЗадание 9\n");
        amountOfSavings = 0;
        double percent = 1.01;
        for (int i = 1; i <= 12; i++) {
            amountOfSavings *= percent;
            amountOfSavings += monthlyContribution;
            System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей\n", i, amountOfSavings);
        }

        // Задание 10
        System.out.printf("\n\nЗадание 10\n");
        for (int i = 1, a = 2, b = 0; i <= 10; i++) {
            b = a * i;
            System.out.printf("%s * %s = %s\n", a, i, b);
        }*/

    }
}