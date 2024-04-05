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
            default:
                System.out.println("Что-то пошло не так, проверь условия");
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
        // Можно и без switch, но вроде как тема занятия про это
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int time = 1;
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            time++;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            time += 2;
        } else if (deliveryDistance > 100){
            time = 0;
        }
        switch (time) {
            case 1:
                System.out.println("Потребуется дней: " + time);
                break;
            case 2:
                System.out.println("Потребуется дней: " + time);
                break;
            case 3:
                System.out.println("Потребуется дней: " + time);
                break;
            default:
                System.out.println("Доставки нет");
        }

        //Задание 5
        System.out.println("Задание 5");
        int monthNumber = 15;
        boolean winter = monthNumber == 12 || monthNumber == 1 || monthNumber == 2;
        boolean spring = monthNumber == 3 || monthNumber == 4 || monthNumber == 5;
        boolean summer = monthNumber == 6 || monthNumber == 7 || monthNumber == 8;
        boolean autumn = monthNumber == 9 || monthNumber == 10 || monthNumber == 11;
        char season = 'p';
        if (winter){
            season = 'w';
        } else if (spring) {
            season = 's';
        } else if (summer) {
            season = 'l';
        } else if (autumn) {
            season = 'a';
        }

        switch (season) {
            case 'w':
                System.out.println("Это зимний месяц");
                break;
            case 's':
                System.out.println("Это весенний месяц");
                break;
            case 'l':
                System.out.println("Это летний месяц");
                break;
            case 'a':
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Ошибка ввода");
        }



    }
}