public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.printf("Задание 1\n");
        int [] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }
        double [] arr2 = {1.57, 7.654, 9.986};
        int [] arr3 = {10, 15, 7, 9, 6};

        // Задание 2
        System.out.printf("\n\nЗадание 2\n");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1){
                System.out.println(arr1[i]);
                break;
            }
            System.out.printf("%s, ", arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1){
                System.out.println(arr2[i]);
                break;
            }
            System.out.printf("%s, ", arr2[i]);
        }

        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1){
                System.out.println(arr3[i]);
                break;
            }
            System.out.printf("%s, ", arr3[i]);
        }

        // Задание 3
        System.out.printf("\n\nЗадание 3\n");

        for (int i = arr1.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.println(arr1[i]);
                break;
            }
            System.out.printf("%s, ", arr1[i]);
        }

        for (int i = arr2.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.println(arr2[i]);
                break;
            }
            System.out.printf("%s, ", arr2[i]);
        }

        for (int i = arr3.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.println(arr3[i]);
                break;
            }
            System.out.printf("%s, ", arr3[i]);
        }

        // Задание 4
        System.out.printf("\n\nЗадание 4\n");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i]++;
            }
            if (i == arr1.length - 1){
                System.out.println(arr1[i]);
                break;
            }
            System.out.printf("%s, ", arr1[i]);
        }



    }
}