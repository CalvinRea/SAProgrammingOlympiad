package School;

import java.util.Scanner;

public class TwentyEighteenPaper {

    public static void main(String[] args) {

    }

    // Q1 Calvin Rea, Java 16
    public static void calculateCost() {
        Scanner x = new Scanner(System.in);
        String input = x.nextLine();
        String[] split = new String[3];
        split = input.split(" ");
        int day = Integer.parseInt(split[0]);
        int evening = Integer.parseInt(split[1]);
        int weekend = Integer.parseInt(split[2]);
        int cost = 0;
        if (day > 100) {
            cost = (day - 100) * 80 + evening * 70 + weekend * 50;
        } else {
            cost = evening * 70 + weekend * 50;
        }
        System.out.println(cost + "c");
        x.close();
    }

    // Q2 Calvin Rea, Java 16
    public static void rovarSprok() {
        Scanner scan = new Scanner(System.in);
        String normal = scan.nextLine();
        String changed = "";
        for (int i = 0; i < normal.length(); i++) {
            char test = normal.charAt(i);
            if (test != 'a' && test != 'e' && test != 'i' && test != 'o' && test != 'u' && test != '\s') {
                changed += test + "o" + test;
            } else {
                changed += test;
            }
            scan.close();
        }
        System.out.println(changed);
    }

    // Q3 Calvin Rea, Java 16
    public static void perfect() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int tested = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                tested += i;
            }
        }
        if (tested == number) {
            System.out.println("Perfect");
        } else if (tested > number) {
            System.out.println("Abundant");
        } else {
            System.out.println("Deficient");
        }
    }
}
