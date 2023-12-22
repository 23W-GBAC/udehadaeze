import java.util.Scanner;

public class Genotype {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the genotype for Father: ");
        String fatherGenotype = keyboard.next();

        System.out.print("Please enter the genotype for Mother: ");
        String motherGenotype = keyboard.next();

        genotypeCalculator(fatherGenotype, motherGenotype);
    }

    public static void genotypeCalculator(String fatherGenotype, String motherGenotype) {
        if ((fatherGenotype.equals("AA") && motherGenotype.equals("AS")) || (fatherGenotype.equals("AS") && motherGenotype.equals("AA"))) {
            System.out.println("Parents have a 50:50 chance of having a child with AA genotype or AS genotype");
        } else if ((fatherGenotype.equals("AA") && motherGenotype.equals("SS")) || (fatherGenotype.equals("SS") && motherGenotype.equals("AA"))) {
            System.out.println("Parents have a 100% chance of having a child with AS genotype");
        } else if ((fatherGenotype.equals("AS") && motherGenotype.equals("SS")) || (fatherGenotype.equals("SS") && motherGenotype.equals("AS"))) {
            System.out.println("Parents have a 50:50 chance of having a child with AS genotype or SS genotype");
        } else if (fatherGenotype.equals("AA") && motherGenotype.equals("AA")) {
            System.out.println("Parents have a 100% chance of having a child with AA genotype");
        } else if (fatherGenotype.equals("AS") && motherGenotype.equals("AS")) {
            System.out.println("Parents have a 100% chance of having a child with AS genotype");
        } else if (fatherGenotype.equals("SS") && motherGenotype.equals("SS")) {
            System.out.println("Parents have a 100% chance of having a child with SS genotype");
        } else {
            System.out.println("Invalid Input entered");
        }
    }
}
