import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Задача 1
        System.out.println("Задача 1");
        System.out.println("Введите ваше имя:");
        String firstName = scanner.next();
        System.out.println("Введите ваше отчество:");
        String middleName = scanner.next();
        System.out.println("Введите вашу Фамилию:");
        String lastName = scanner.next();
        String fulName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О сотрудника - " + fulName);

        // Задача 2
        System.out.println("\nЗадача 2");
        System.out.println("Данные Ф.И.О сотрудника для заполнения отчета - " + fulName.toUpperCase());

        // Задача 3
        System.out.println("\nЗадача 3");
        fulName = fulName.replace("ё", "е");
        System.out.println("Данные Ф.И.О сотрудника - " + fulName);



    }
}