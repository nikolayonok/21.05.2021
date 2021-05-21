import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a = sc.nextInt();
        System.out.println("Введите второе число ");
        int b = sc.nextInt();
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
