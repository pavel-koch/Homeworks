public class Main {
    public static void main(String[] args) {
        int points = 10;

        do {
            System.out.println("Осталось " + points + " баллов.");
            points--;
        } while (points >= 0);

        System.out.println("Игра окончена!");
    }
}