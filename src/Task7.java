import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int a = sc.nextInt();
        System.out.println("Введите символ ");
        String b = sc.next();
        for (int i = 1; i < a; i++) {
            System.out.println(b);
        }
    }
}