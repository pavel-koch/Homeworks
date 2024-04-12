import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1

        int [] sum = {256, 712, 365, 514, 212};
        System.out.println(Arrays.stream(sum).sum());
    }
}