package lr1;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int y = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        System.out.println((b+y) + " " + (b-y) + " " + (y-b));
    }
}
