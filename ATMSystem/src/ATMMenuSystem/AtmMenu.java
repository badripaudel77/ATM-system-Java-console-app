package ATMMenuSystem;

import ATMAccountSystem.BalanceCheck;
import java.util.Scanner;

public class AtmMenu {

    private static int id = 12345;

    public AtmMenu() {
        System.out.println("------Welcome to this  ATM------");
        System.out.println("Insert Your Debit/Credit/MasterCard");

    }

    public AtmMenu(int pin) {
//        Scanner inputId=new Scanner("System.in");
//        System.out.println("Enter your Pin number");
        // id=inputId.nextInt();
        if (id == pin) {
            System.out.println("Password Matched,Please Proceed"+"\n");
            performWork();
        } else {

            System.out.println("SORRY PIN DID NOT MATCH,TRY AGAIN ");
        }

    }

    public void performWork() {
        Scanner inputId = new Scanner(System.in);
        System.out.println("1: WithDraw Amount");
        System.out.println("2: Balance Enquiry");
        System.out.println("3: cancel");
        System.out.println("4: exit");
        System.out.println("5: Reset Password");
        int id;
        id = inputId.nextInt();
        switch (id) {
            case 1:
                withDraw();
                break;
            case 2:
                inquiryBalance();
                break;
            case 3:
                cancelOperation();
                break;
            case 4:
                exitOperation();
                break;
            case 5:
                resetPassword();
                break;
            default:
                System.out.println("Not valid choice");
        }

    }

    public void withDraw() {
        BalanceCheck obj = new BalanceCheck();
        obj.withdraw();

    }

    public void inquiryBalance() {
        BalanceCheck obj = new BalanceCheck();
        obj.balanceCheck();
    }

    public void cancelOperation() {
        performWork();
    }

    public void exitOperation() {
        System.exit(0);
    }
    public void resetPassword()
    {
        Scanner sc = new Scanner(System.in);
        int newPassword1,newPassword2;
        System.out.println("Enter the password to Reset");
        newPassword1=sc.nextInt();
        System.out.println("Confirm Password");
        newPassword2=sc.nextInt();
        if(newPassword1==newPassword2){
        
            id=newPassword1;
            System.out.println("Password SuccessFully Updated"+"  Please proceed now\n");
            //System.out.println("pass word is"+id);
            performWork();
        }
    }
}
