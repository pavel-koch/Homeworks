public class Main {
    public static void main(String[] args) {
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
        }

        //Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2010;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
        }

        //Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        int sourceYear = 1584;
        boolean leapYear = year >= sourceYear && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
        if (leapYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задание 4
        System.out.println("Задание 4");

    }
}