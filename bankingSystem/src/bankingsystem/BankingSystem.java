package bankingsystem;
import java.util.*;
public class BankingSystem {
     public static void main(String []args){
         int choice;
         Scanner input = new Scanner(System.in);
         System.out.println("\t\t\t\t\t WELCOME TO FIRST BANK ");
         System.out.println();
         int quit=0;
         while(quit==0){
         BankingSystem login = new BankingSystem();
         login.login();
         choice = input.nextInt();
         BankingSystem select = new BankingSystem();
         select.num(choice);
         }
     }
     Scanner input = new Scanner(System.in);
     int pin =1234,bal=0,withdraw=0,newBal;
     void login(){
         System.out.println("KINDLY ENTER YOUR FOUR DIGIT PIN:");
         int digit = input.nextInt();
         if(digit==pin){
             System.out.println();
             System.out.println("\t\t\t\t\tWELCOME TO YOUR ACCOUNT");
             System.out.println();
             System.out.println("Enter (1) for Account Balance");
             System.out.println();
             System.out.println("Enter (2) for Withdrawl");
             System.out.println();
             System.out.println("Enter (3) for QuickTeller");
             System.out.println();
             System.out.println("Enter (4) for Airtime Recharge");
             System.out.println();
             System.out.println("Enter (5) for Cancel/Quit");
             System.out.println();
         }
     }
    void num(int choice){ 
        if(choice==1){
            BankingSystem AcctBal = new BankingSystem();
            AcctBal.getBal();
            System.out.println("Your account balance is");
            System.out.println(AcctBal.getBal());
              BankingSystem nextOp= new BankingSystem();
              nextOp.operation();
        }
        if(choice ==2){
            System.out.println("Enter the amount:");
            int amount = input.nextInt();
          BankingSystem Withdrawl = new BankingSystem();
            Withdrawl.withdraw(amount);
            BankingSystem nextOp= new BankingSystem();
              nextOp.operation();
        }
        if(choice ==3){
            System.out.println("Enter the amount:");
            int amount = input.nextInt();
            System.out.println("Bank name");
            String name = input.next();
            System.out.println("Enter Destination's account number");
            String accno = input.next();
          BankingSystem teller = new BankingSystem();
            teller.teller(amount); 
            BankingSystem nextOp= new BankingSystem();
              nextOp.operation();
        }
        if(choice ==4){
          BankingSystem Airtime = new BankingSystem();
            Airtime.getBal();  
            BankingSystem nextOp= new BankingSystem();
              nextOp.operation();
        }
        if(choice ==5){           
            System.out.println("Thanks for banking with us");
            System.out.println("Kindly remove your ATM card");
            System.exit(0);
        }
    } 
     BankingSystem(){ 
         bal = 40000;
         newBal = bal-withdraw;
     } 
    
   void withdraw(int amount){
       if(bal >= amount){
           bal -= amount;
           System.out.println("Transaction Successful");
       }
       else{
           System.err.println("Insufficient Funds");
       }
        bal -= amount;
   }
   void teller(int amount){
       if(bal >= amount){
           bal -= amount;
           System.out.println("Transaction Successful");
       }
       else{
           System.err.println("Insufficient Funds");
       }
        bal -= amount;
       
   }
    int getBal(){
       return newBal;
   }
    void operation(){
       System.out.println("Do you wish to continue... (1) for YES and (0) for NO");
       int ans = input.nextInt();
       if(ans==1){
           BankingSystem login = new BankingSystem();
         login.login();
       }
       else{
           System.exit(0);
       }
   }
}
    