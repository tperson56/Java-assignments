public class Main {
   public static void main(String[] agrs) {
      // you may write code in this main method to test your required method
      int difference;
      difference = DiffMinMax(50, 100, 10);
      System.out.println(difference);
   }
   
   // define your required method here below
   public static int DiffMinMax(int a, int b, int c){
      int min, max;
      if(a <= b && a<= c){
         min = a;
      }
      else if(b <= a && b <= c){
         min = b;
      }
      else{min = c;}
      
      if(a >= b && a >= c){
         max = a;
      }
      else if(b >= a && b >= c){
         max = b;
      }
      else{max = c;}
      
      return max - min;
   }
boolean 
}
