import java.util.Scanner;

  public class individualData {
    public static void main(String[] args) {
        System.out.println("WELCOME to Ada's BMICalculator!!!");
        System.out.println("Notice: This Calculator is intended for use by individuals over the age of 18");
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter your Gender: ");
        String gender = keyboard.next();
        
         System.out.print("Enter your Weight in kg: ");
        double weight = keyboard.nextDouble();
        
         System.out.print("Enter your Height in cm: ");
        double height = keyboard.nextDouble();
        
        double bmiValue = bmiCalculatorFormula(weight,height);
        bmiDisplayresult(bmiValue);
    }
    public static double bmiCalculatorFormula(double weight, double height) {
    double heightInMeters = height / 100;
    double bmiValue = weight / (heightInMeters * heightInMeters);
    return bmiValue;
}
  public static void bmiDisplayresult(double bmiValue){
      if(bmiValue < 18.5 ){
           System.out.println("You are Underweight");
      } else if (bmiValue >=18.5 && bmiValue <= 24.9){
         System.out.println("You are Normal weight"); 
      } else if (bmiValue >=25.0 && bmiValue <=29.9){
          System.out.println("You are Overweight"); 
      } else {
           System.out.println("You are obese");
      }
      
  }
    
}


