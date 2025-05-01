public class FixDebugSix3
{
   public static void main(String[] args)
   {
      double price = 19.99;
      double taxRate = 0.06;
      double total = price + (price * taxRate); // Correct logic
      System.out.println("Total price is " + total); // Fixed concatenation
   }
}
