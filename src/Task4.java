import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа ");
        int a = sc.nextInt(), b = sc.nextInt();
        int x = 0;
        int z = 0;
        for (int i = a; i < b; i++) {
            x += i;
            z++;
        }
        System.out.println(x);
        System.out.println(x / z);
    }
}
