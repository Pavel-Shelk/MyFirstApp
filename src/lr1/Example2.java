package lr1;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = in.nextLine();
        System.out.println("Введите возраст");
        int age = in.nextInt();
        System.out.println("Ваше имя:      \t" + name);
        System.out.println("Ваш возраст:   \t" + age);
    }
}
