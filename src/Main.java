public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задание 1");
        int age = 15;
        boolean adult = age >= 18;
        if (adult) {
            System.out.println("Если возраст человека равен " + age
                    + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age
                    + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2
        System.out.println("Задание 2");
        int temp = 5;
        if (temp < 5 || temp > 5) {
            if (temp < 5){
                System.out.println("На улице " + temp
                        + " градусов, нужно надеть шапку");
            } else {
                System.out.println("На улице " + temp
                        + " градусов, можно идти без шапки");
            }
        } else {
            System.out.println("На улице " + temp
                    + " градусов, возьми с собой шапку, а там разберемся :)");
        }

        // Задача 3
        System.out.println("Задание 3");
        int speed = 70;
        if (speed < 60 || speed > 60) {
            if (speed > 60){
                System.out.println("Если скорость " + speed
                        + ", то придется заплатить штраф");
            } else {
                System.out.println("Если скорость " + speed
                        + ", то можно ездить спокойно");
            }
        } else {
            System.out.println("Если скорость " + speed
                    + ", то едешь по грани, будь осторожен :)");
        }

        // Задача 4
        System.out.println("Задание 4");
        int personАge = 1;
        if (personАge >= 2) {
            if (personАge <= 6){
                System.out.println("Если возраст человека равен " + personАge
                        + ", то ему нужно ходить в детский сад");
            } else {
                if (personАge <= 17) {
                    System.out.println("Если возраст человека равен " + personАge
                            + ", то ему нужно ходить в школу");
                } else {
                    if (personАge <= 24) {
                        System.out.println("Если возраст человека равен " + personАge
                                + ", то его место в университете");
                    } else {
                        System.out.println("Если возраст человека равен " + personАge
                                + ", то ему пора ходить на работу");
                    }
                }
            }
        } else {
            System.out.println("Если возраст человека равен " + personАge
                    + ", то ему еще рано куда-то ходить");
        }

        // Задача 5
        System.out.println("Задание 5");
        int babyAge = 6;
        boolean accompanying = true;
        if (babyAge >= 5) {
            if (babyAge >= 14){
                System.out.println("Если возраст ребенка равен " + babyAge
                        + ", можно кататься на аттракционе без сопровождении взрослого");

            } else {
                if (accompanying) {
                    System.out.println("Если возраст ребенка равен " + babyAge
                            + ", можно кататься на аттракционе в сопровождении взрослого");
                } else {
                    System.out.println(" Тебе нужен сопровождающий");
                }
            }
        } else {
            System.out.println("Если возраст ребенка равен " + babyAge
                    + ", то ему нельзя кататься на аттракционе");
        }

        // Задача 6
        System.out.println("Задание 6");
        int capacity = 120;
        int passengers = 40;
        boolean places = capacity > passengers;
        if (places) {
            if (passengers < 60){
                System.out.println("В вагоне есть свободные сидячие места");
            } else {
                System.out.println("В вагоне остались только стоячие места");
            }

        } else {
            System.out.println("В вагоне нет мест");
        }

        // Задача 7
        System.out.println("Задание 7");
        int one = 6;
        int two = 16;
        int three = 15;
        if (one == two || one == three || two == three) {
            System.out.println("Есть числа равные между собой, измени условия");
        } else {
            if (one > two && one > three) {
                System.out.println("Самое большое число one = " + one);
            } else {
                if (two > one && two > three) {
                    System.out.println("Самое большое число two = " + two);
                } else {
                    System.out.println("Самое большое число three = " + three);
                }
            }
        }
    }
}