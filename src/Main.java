import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("\nЗадание 1");
        int year = 2021;
        checkLeapYear(year);

        //Задание 2
        System.out.println("\nЗадание 2");
        int clientDeviceYear = 2014;
        int clientOS = 0;
        selectionVersion(clientOS, clientDeviceYear);

        //Задание 3
        System.out.println("\nадание 3");
        int deliveryDistance = 101;
        int time = calculationDeliveryTime(deliveryDistance);
        if (time != 0) {
            System.out.printf("Потребуется дней: %s \n", time);
        } else {
            System.out.printf("Доставки нет");
        }

    }

    public static void checkLeapYear (int year) {
        int sourceYear = 1584;
        boolean leapYearConditions = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        boolean leapYear = year >= sourceYear && leapYearConditions;
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void selectionVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такая система не поддерживается");
        }
    }

    public static int calculationDeliveryTime (int distance) {
        int time = 1;
        if (distance > 20) {
            time++;
        }
        if (distance > 60) {
            time++;
        }
        if (distance > 100) {
            return 0;
        } else {
            return time;
        }
    }

}