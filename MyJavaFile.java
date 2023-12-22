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
        if ((father.equals("AA") && mother.equals("AS")) || (father.equals("AS") && mother.equals("AA"))) {
            System.out.println("Parents have a 50:50 chance of having a child with AA genotype or AS genotype");
        } else if ((father.equals("AA") && mother.equals("SS")) || (father.equals("SS") && mother.equals("AA"))) {
            System.out.println("Parents have a 100% chance of having a child with AS genotype");
        } else if ((father.equals("AS") && mother.equals("SS")) || (father.equals("SS") && mother.equals("AS"))) {
            System.out.println("Parents have a 50:50 chance of having a child with AS genotype or SS genotype");
        } else if (father.equals("AA") && mother.equals("AA")) {
            System.out.println("Parents have a 100% chance of having a child with AA genotype");
        } else if (father.equals("AS") && mother.equals("AS")) {
            System.out.println("Parents have a 100% chance of having a child with AS genotype");
        } else if (father.equals("SS") && mother.equals("SS")) {
            System.out.println("Parents have a 100% chance of having a child with SS genotype");
        } else {
            System.out.println("Invalid Input entered");
        }
    }
}

