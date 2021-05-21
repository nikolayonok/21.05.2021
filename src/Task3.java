import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите диапазон ");
        int a = sc.nextInt(), b = sc.nextInt(), min, max;

        if (a > b) {
            min = b;
            max = a;
        } else {
            min = a;
            max = b;
        }

        for (int i = min; i < max; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
