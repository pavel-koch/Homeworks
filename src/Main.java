public class Main {
    public static <string> void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такая система не поддерживается");
        }

        //Задание 2
        System.out.println("\nЗадание 2");
        int clientDeviceYear = 2010;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такая система не поддерживается");
        }

        //Задание 3
        System.out.println("\nЗадание 3");
        int year = 2021;
        int sourceYear = 1584;
        boolean leapYearConditions = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        boolean leapYear = year >= sourceYear && leapYearConditions;
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задание 4
        System.out.println("\nадание 4");
        int deliveryDistance = 15;
        int time = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + time);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            time++;
            System.out.println("Потребуется дней: " + time);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            time += 2;
            System.out.println("Потребуется дней: " + time);
        } else if (deliveryDistance > 100){
            System.out.println("Доставки нет");
        }

        //Задание 5
        System.out.println("\nЗадание 5");
        int monthNumber = 11;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Это зимний месяц");
            case 3, 4, 5 -> System.out.println("Это зимний месяц");
            case 6, 7, 8 -> System.out.println("Это зимний месяц");
            case 9, 10, 11 -> System.out.println("Это зимний месяц");
            default -> System.out.println("Ошибка ввода");
        }
    }
}