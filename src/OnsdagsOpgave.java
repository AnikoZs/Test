import java.util.Arrays;
import java.util.Scanner;

public class OnsdagsOpgave {

    public static void main(String[] args) {
// udskriv muligheder
        displayThingsOnIsland(thingsOnIsland());

        int[] answers = inputAnswers();

        //System.out.println("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");

        int[] answerHistogram = countingAnswer(answers);
        displayPopularOption(answerHistogram);

    }

    public static String[] thingsOnIsland() {
        String[] options = {"kæreste", "kaffemaskine", "Netflix", "sofa", "løbesko", "guitar", "slik", "hund", "bog", "øl"};
        return options;
    }

    public static void displayThingsOnIsland(String[] options) {
        int countOption = 1;

        System.out.println("Hvilken ting vil du helst have med på en øde ø?");
        for (String option : options) {
            System.out.println(countOption + "\t" + option);
            countOption++;
        }
    }

    public static int[] inputAnswers() {
        int[] answers = new int[10];
        int count = 1;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < answers.length; i++) {
            int scannerInput;

            do {
                System.out.print("Vælg mulighed (person " + count + "/" + answers.length +"): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Det er ikke et nummer!");
                    System.out.print("Vælg mulighed (person " + count + "/" + answers.length +"): ");
                    scanner.next();
                }
                scannerInput = scanner.nextInt();

                if (scannerInput<= 0 || scannerInput >=11) {
                    System.out.println("Nummert skal være på listen");
                }
            } while (scannerInput <= 0 || scannerInput >=11);
            answers[i] = scannerInput - 1;
            count++;
        }

        return answers;
    }

    public static int[] countingAnswer(int[] answers) {
        int[] countAnswer = new int[answers.length];

        for (int answer : answers) {
            countAnswer[answer]++;
        }

        // System.out.println(Arrays.toString(countAnswer));
        return countAnswer;

    }

    public static int findBiggestNumber(int[] answers) {
        int chek = answers[0];
        int max = 0;

        for (int i = 1; i < answers.length; i++) {
            if (answers[i] > chek) {
                chek = answers[i];
                max = i;
            }
        }

        return max;
    }

    public static void displayPopularOption(int[] answers) {
        int max = findBiggestNumber(answers);
        String[] options = thingsOnIsland();

        System.out.println("Mest populær valg er: " + options[max]);
    }

}

