import java.util.Scanner;

public class Genotype {
    public static void main(String[] args) {
        genotypeCalculator();
    }

    public static void genotypeCalculator() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the genotype for Father: ");
        String fatherGenotype = keyboard.next();

        System.out.print("Enter the genotype for Mother: ");
        String motherGenotype = keyboard.next();

        String childGenotype = determineChildGenotype(fatherGenotype, motherGenotype);

        if (childGenotype != null) {
            System.out.println("The child's genotype is: " + childGenotype);
        } else {
            System.out.println("Invalid input entered for parent genotypes.");
        }
    }

    public static String determineChildGenotype(String father, String mother) {
        if (isValidGenotype(father) && isValidGenotype(mother)) {
            if ((father.equals("AA") && mother.equals("AS")) || (father.equals("AS") && mother.equals("AA"))) {
                return "AA or AS";
            } else if ((father.equals("AA") && mother.equals("SS")) || (father.equals("SS") && mother.equals("AA"))) {
                return "AS";
            } else if ((father.equals("AS") && mother.equals("SS")) || (father.equals("SS") && mother.equals("AS"))) {
                return "AS or SS";
            } else if (father.equals("AA") && mother.equals("AA")) {
                return "AA";
            } else if (father.equals("AS") && mother.equals("AS")) {
                return "AS";
            } else if (father.equals("SS") && mother.equals("SS")) {
                return "SS";
            }
        }
        return null;
    }

    public static boolean isValidGenotype(String genotype) {
        // Add more conditions if needed
        return genotype.matches("[AS]{2}");
    }
}
