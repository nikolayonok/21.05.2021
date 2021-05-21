import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Первое число");
        int a = sc.nextInt();
        System.out.println("Второе число");
        int b = sc.nextInt();
        for (int j = a; j < b; j++) {
            System.out.println(j);
        }
    }
}
