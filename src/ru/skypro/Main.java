package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + i;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
        System.out.println();
        int min = arr[0];
        int max = arr[0];
        for (int value = 0; value < arr.length; value++) {
            if (value < min) {
                min = value;
            } else if (value > max) {
                max = value;
            }
        }
        System.out.println("Минимальная сумма затрат за день сотсавила " + min + ".Максимальная сумма затрат за день составила " + max);
        System.out.println();
        float average = total / arr.length;
        System.out.println("Средняя сумма затрат за месяц составила " + average + " рублей");
        System.out.println();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.println(reverseFullName[i]);
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
