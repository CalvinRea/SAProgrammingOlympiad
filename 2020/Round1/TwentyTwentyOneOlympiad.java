package School;

import java.util.Arrays;

public class TwentyTwentyOneOlympiad {
    public static void main(String[] args) {
        //call relevant method and input test case as parameter
    }

    // Q1 Calvin Rea, Java 16
    public static void discriminant(String str) {
        String[] temp = str.split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[1]);
        int c = Integer.parseInt(temp[2]);
        int d = Integer.parseInt(temp[3]);
        long answer = (a * d - b * c);
        System.out.print(answer);
    }

    // Q2 Calvin Rea, Java 16
    public static void nTerms(int n) {
        double answer = 0;
        for (double i = 1; i <= n; i++) {
            answer += i / (i + 1);
        }
        System.out.println(answer);
    }

    // Q3 Calvin Rea, Java 16
    public static void Aladin(String input) {

        char[] chars = input.toCharArray();
        int length = input.length();
        Arrays.sort(chars);
        int numColour = 1;
        for (int i = chars.length - 1; i >= 1; i--) {
            if (chars[i] != chars[i - 1]) {
                numColour++;
            }
        }
        int price = numColour * length;
        System.out.println(price);
    }
}
