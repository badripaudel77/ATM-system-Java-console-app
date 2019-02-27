package ATMAccountSystem;
import java.util.Scanner;

public class BalanceCheck {
    Scanner debiteAmt=new Scanner(System.in);
    private double debiteBalance;
    private double balance=2000;

  public void balanceCheck()
  {
      System.out.println("Your Remaining total Balance is "+balance+" Only!");
      System.out.println("Thank you  for banking with us\n");
      }
  public void withdraw(){
      System.out.println("Enter the amount to debite");
      debiteBalance=debiteAmt.nextInt();
      if(debiteBalance%500==0 ){
   
          if(((debiteBalance+1000)<=balance))
          {
          balance-=debiteBalance;
          System.out.println("Amount "+debiteBalance+"Debited Successfully");
          System.out.println("Your Remainging total Balance is "+balance+" Only!");
          System.out.println("Thank you for banking with us\n");
          }
      
      else{
          System.out.println("Insuffiecient Fund");
              System.out.println("Your minimum deposti is 1000 and your total balance is "+balance);
      }
      
  }
      else
      {
          System.out.println("Amount Should be multiple of 500");
      }
  }

}
  

