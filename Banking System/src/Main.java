import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      //Parameterized Constructors
      Bank myAcc = new Bank("Nikhil","nikhil946839@gmail.com",1234);
      System.out.println(myAcc.getCustomerName());

      System.out.println("Enter Your Name: ");
      myAcc.setCustomerName(sc.nextLine());

      System.out.println("Enter Your Account Number: ");
      myAcc.setAccountNumber(sc.nextInt());

      while(true)
      {
      System.out.println("1. Deposit Amount\n2. Withdraw Amount\n3. Details\n4. Exit");

         int choice = sc.nextInt();

         switch (choice)
         {
            case 1:
               System.out.println("Enter Amount to Be Deposited: ");
               double Amount = sc.nextDouble();
               myAcc.depositFund(Amount);
               System.out.println("Current Balance: "+ myAcc.getBalance());
               break;

            case 2:
               System.out.println("Enter Amount to be withdrawed:");
               double withdrawAmt = sc.nextDouble();
               myAcc.withdrawFund(withdrawAmt);
               System.out.println("Current Balance: "+ myAcc.getBalance());
               break;
            case 3:
               System.out.println("Account Number\tName\tAccBalance");
               System.out.println("--------------------------------------");
               System.out.println(myAcc.getAccountNumber()+ "\t\t" + myAcc.getCustomerName() + "\t" + myAcc.getBalance());
               System.out.println("--------------------------------------");
               break;
            case 4:
               System.exit(0);
               break;
            default:
               System.out.println("Invalid Choice");
         }
//      sc.close();
      }
   }
}