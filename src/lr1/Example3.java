package lr1;
import java.util.Scanner;
import java.util.Date;
public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("День недели");
        String day = in.nextLine();
        System.out.println("Месяц");
        String month = in.nextLine();
        System.out.println("Дата");
        int num = in.nextInt();
        System.out.println("Если вы вдруг забыли дату, то сегодня: \t" + day + "," + month + "," + num);


    }
}
