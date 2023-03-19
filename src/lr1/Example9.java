package lr1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int y = in.nextInt();
        int b = 2;
        System.out.println( (y) + " " + (y-1) + " "  + (y+1) + " " + Math.pow((y + (y-1) + (y-1)),b));
    };
}
