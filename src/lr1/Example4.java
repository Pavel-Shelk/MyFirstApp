package lr1;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Месяц");
        String month = in.nextLine();
        System.out.println("Количество дней");
        int num = in.nextInt();
        System.out.println("\t" + month + " " +  "содержит" + " " + num + " " +  "дней");
    }
}
