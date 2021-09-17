import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String currentSalary, penultimateSalary, antepenultSalary, avarageSalaryStr;
        Float avarageSalary;

        final String WHATS_YOUR = "What's your";
        final String SALARY = " salary";
        final String CURRENT = " current";
        final String PENULTIMATE = " penultimate";
        final String ANTEPENULT = " antepenult";
        final String YOUR_AVARAGE = "Your avarage";
        final String IS_WITH_COLON = " is: ";
        final String QUESTION_MARK = "?";
        final String MONEY_CIPHER = "$";
        final byte NUMBER_OF_SALARIES = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.println(WHATS_YOUR + CURRENT + SALARY + QUESTION_MARK);
        currentSalary = scanner.nextLine();
        System.out.println(WHATS_YOUR + PENULTIMATE + SALARY + QUESTION_MARK);
        penultimateSalary = scanner.nextLine();
        System.out.println(WHATS_YOUR + ANTEPENULT + SALARY + QUESTION_MARK);
        antepenultSalary = scanner.nextLine();

        scanner.close();

        avarageSalary = calculateAvarageSalary(currentSalary, penultimateSalary, antepenultSalary, NUMBER_OF_SALARIES);

        System.out.printf(YOUR_AVARAGE + SALARY + IS_WITH_COLON + MONEY_CIPHER + "%.2f.",
                avarageSalary);

    }

    private static Float calculateAvarageSalary(String currentSalary, String penultimateSalary, String antepenultSalary, byte NUMBER_OF_SALARIES) {
        Float avarageSalary;
        avarageSalary = Float.parseFloat(currentSalary);
        avarageSalary += Float.parseFloat(penultimateSalary);
        avarageSalary += Float.parseFloat(antepenultSalary);
        avarageSalary = avarageSalary / NUMBER_OF_SALARIES;
        return avarageSalary;
    }
}


