package Task1;
 
import java.util.Scanner;

public class Discount
{
   public static void main(String[] args)
   {
      float totalCost, costToPaid, discount;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("750");
      totalCost = sc.nextFloat();
      
      if(totalCost<=500)
      {
         costToPaid = totalCost;
         System.out.println("there is no discount to apply.");
      }
      else if(totalCost>500 && totalCost<=1000)
      {
         discount = (totalCost*10)/100;
         costToPaid = totalCost - discount;
         
         System.out.println(costToPaid);
      }
      else if(totalCost>1500)
      {
         discount = (totalCost*20)/100;
         costToPaid = totalCost - discount;
         
         System.out.println("the cost to be paid is:"+costToPaid);
      }
     
   } 
}
