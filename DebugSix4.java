public class FixDebugSix4
{
   public static void main(String[] args)
   {
      int num1 = 5;
      int num2 = 0;
      if(num2 != 0)
         System.out.println("Result: " + num1 / num2);
      else
         System.out.println("Cannot divide by zero."); // Prevents crash
   }
}
