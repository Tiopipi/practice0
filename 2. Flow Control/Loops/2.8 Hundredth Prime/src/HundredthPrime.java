public class HundredthPrime
{
   public static void main(String[] args)
   {
      int count = 1;
      int currentNumber = 3;
      int divisor;
      while(count < 100) {
         for (divisor = 2; divisor<= currentNumber; divisor++) {
            if (currentNumber == 3) {
               count++;
               currentNumber++;
               break;
            }
            if ((currentNumber % 2) == 0) {
               currentNumber++;
               break;
            }
            else if (((currentNumber % divisor) == 0) && (currentNumber != divisor)) {
               currentNumber++;
               break;
            }
         }
         if ((divisor - 1) == currentNumber) {
            currentNumber++;
            count++;
         }
      }
      currentNumber--;
      System.out.println(currentNumber);
   }
}