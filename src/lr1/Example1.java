package lr1;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Введите фамилию");
        String last = in.nextLine();
        System.out.println("Введите имя");
        String name = in.nextLine();
        System.out.println("Введите отчество");
        String sure = in.nextLine();
        System.out.println("Hello     \t"  + last + ","  +  name + "," +  sure);
    }
}
