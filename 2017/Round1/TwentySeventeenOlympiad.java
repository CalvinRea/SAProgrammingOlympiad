package School;

import java.util.Scanner;

public class TwentySeventeenOlympiad {
    public static void main(String[] args) {

    }

    // Q1 Calvin Rea, Java 16
    public static void interestRates() {
        double pInitial = 0;
        double rInterest = 0;
        double tNumYears = 0;
        double aAnswer = 0;
        Scanner scan = new Scanner(System.in);

        pInitial = scan.nextDouble();
        rInterest = scan.nextDouble();
        tNumYears = scan.nextDouble();

        aAnswer = pInitial + (pInitial * tNumYears * (rInterest / 100));

        System.out.println(aAnswer);
        scan.close();
    }

    // Q2 Calvin Rea, Java 16
    public static void tribonacci() {
        // tribonachi starts with three numbers, next number formed by adding previous 3
        // together
        // produce the nth term of this sequance given three intigers
        Scanner x = new Scanner(System.in);

        int[] tempArr = new int[3];
        tempArr[0] = x.nextInt();
        tempArr[1] = x.nextInt();
        tempArr[2] = x.nextInt();
        int nth = x.nextInt();
        int[] tribArr = new int[nth];
        tribArr[0] = tempArr[0];
        tribArr[1] = tempArr[1];
        tribArr[2] = tempArr[2];
        for (int i = 3; i < nth; i++) {
            tribArr[i] = tribArr[i - 1] + tribArr[i - 2] + tribArr[i - 3];
        }
        System.out.println(tribArr[nth - 1]);
    }

    // Q3 Calvin Rea, Java 16
    public static void wordLength() {
        // calculate average length(letters upper and lower) of words,round off two
        // decimal places
        Scanner x = new Scanner(System.in);
        String str = x.nextLine();
        double charCount = 0;
        double tempCharCount = 0;
        double wordCount = 0;
        double average;
        String[] split = str.split(" ");
        for (int i = 0; i < split.length; i++) {
            tempCharCount = charCount;
            for (int j = 0; j < split[i].length(); j++) {
                if (split[i].charAt(j) != '\"' && split[i].charAt(j) != '.' && split[i].charAt(j) != ','
                        && split[i].charAt(j) != '!' && split[i].charAt(j) != '?' && split[i].charAt(j) != '-') {
                    charCount++;
                } else if (charCount == tempCharCount) {
                    wordCount--;
                }
            }
        }
        wordCount += split.length;
        average = charCount / wordCount;
        average = (int) (average * 100);
        average = average / 100;
        System.out.println(average);
    }
}
