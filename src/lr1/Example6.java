package lr1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = in.nextLine();

        int x = 2023;
        System.out.println("Год рождения");
        int y = in.nextInt();
        System.out.println( name + " " +  (x-y));
    }
}
