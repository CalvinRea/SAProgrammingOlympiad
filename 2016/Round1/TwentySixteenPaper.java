package School;

import java.util.Scanner;

public class TwentySixteenPaper {
    public static void main(String[] args) {
        
    }

    // Q1 Calvin Rea, Java 16
    public static void speeding() {
        // time in seconds and distance in meters as input, speed km/h output rounded
        Scanner scan = new Scanner(System.in);
        double time = scan.nextInt();
        double distance = scan.nextInt();
        double speed = distance / time;// m per sec to km/h 60*60 secs in hour, /1000 form km
        int speedKMH = (int) (speed * 60 * 60 / 1000);
        System.out.println(speedKMH);
    }

    // Q2 Calvin Rea, Java 16
    public static void maths() {
        // input is possitive interger, calculates factors other than itself, factor
        // divides without remainder
        // sum the factors as output
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int sum = 1;
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

    }

    // Q3 Calvin Rea, Java 16
    public static void encryption() {

        Scanner scan = new Scanner(System.in);
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String input = scan.next();
        int shift = scan.nextInt();
        char[] list = input.toCharArray();
        char[] output = new char[list.length];
        int k = 0;
        int index;
        for (int i = list.length - shift; k < shift; i++) {
            output[k] = list[i];
            k++;
        }
        for (int i = 0; i < output.length - shift; i++) {
            output[k] = list[i];
            k++;
        }
        for (int i = 0; i < output.length; i++) {
            index = letters.indexOf(output[i]) + shift;
            if (index <= 26) {
                output[i] = letters.charAt(index);
            } else {
                index -= 26;
                output[i] = letters.charAt(index);
            }

        }

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }

    }
}
