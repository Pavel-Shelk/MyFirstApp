package lr1;

import java.util.Scanner;
import java.util.Date;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 2023;
        System.out.println("Год рождения");
        int y = in.nextInt();

        System.out.println(x-y);

    }
}