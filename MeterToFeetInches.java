import java.util.Scanner;

public class Converter {
   public static void main(String[] args) {
      // Below this comment: declare and instantiate a Scanner
      Scanner scnr = new Scanner(System.in);
      
      // Below this comment: declare any other variables you may need
      // to store the user's input and the Feet and Inches equivalent value
      double inMeters;
      String feetInchesStr;
      
      
      
      // Below this comment: collect the required inputs
      System.out.print("Enter distance in Meters : ");
      inMeters = scnr.nextDouble();
      System.out.println();
      
      // Below this comment: call your MetersToFeetAndInches method
      feetInchesStr = MetersToFeetAndInches(inMeters);
      
      // Below this comment: disply the required results
      System.out.printf("%.2f meters in Feet and Inches is : " + feetInchesStr, inMeters);
   }
   
   // define your MetersToFeetAndInches method here below
   public static String MetersToFeetAndInches(double meters) {
      double feet;
      double inches;
      int feetInt;
      String output = "";
      feet = ((meters * 39.37) / 12.0);
      feetInt = (int)feet;
      inches = (feet - feetInt) * 12;
      System.out.println(inches);
      output = String.format(feetInt + "' %.2f\"" , inches);
      return output; 
   }
}
