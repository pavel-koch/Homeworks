import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.printf("Задание 1\n");
        int [] arrSum = {256, 712, 365, 514, 212};
        // Вариант 1
        System.out.printf("Сумма трат за месяц составила %s рублей\n", Arrays.stream(arrSum).sum());
        // Вариант 2
        double summa = 0;
        for (int i : arrSum){
            summa += i;
        }
        System.out.printf("Сумма трат за месяц составила %s рублей\n", summa);

        // Задание 2
        System.out.printf("\n\nЗадание 2\n");
        int minElem = arrSum[0];
        int maxElem = arrSum[0];
        // Вариант 1
        for (int i : arrSum){
            if (minElem > i) {
                minElem = i;
            }
            if (maxElem < i) {
                maxElem = i;
            }
        }
        System.out.printf("Миннимальная сумма трат за неделю составила %s рублей.\n" +
                "Максимальная сумма трат за неделю составила %s рублей\n", minElem, maxElem);

        // Задание 3
        System.out.printf("\n\nЗадание 3\n");
        double averageExpenses = summa / arrSum.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", averageExpenses);

        // Задание 4
        System.out.printf("\n\nЗадание 4\n");
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(Arrays.toString(reverseFullName));
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}