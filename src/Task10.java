import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону квадрата ");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                if (i == 0 || i == a || j == 0 || j == a) {
                    System.out.print("*");
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println(' ');
        }
    }
}

