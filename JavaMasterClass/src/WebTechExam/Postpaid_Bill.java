//package WebTechExam;
//
//import java.util.Scanner;
//class InputValidationException extends Exception{
//    InputValidationException(String s){
//        super(s);
//    }
//}
//class Postpaid_Bill{
//    String Mobile_number, customer_Id, bill_date;
//    int monthly_transactions[] = new int[5];
//    void get_PostPaidbill(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Mobile Number: ");
//        Mobile_number = sc.next();
//        System.out.println("Enter Customer Id: ");
//        customer_Id = sc.next();
//        System.out.println("Enter Bill Date: ");
//        bill_date = sc.next();
//        for(int i = 0; i < 5; i++){
//            monthly_transactions[i] = sc.nextInt();
//        }
//    }
//    int getTotalAmount(){
//        int tot = 0;
//        for(int i = 0; i < 5; i++){
//            tot += monthly_transactions[i];
//        }
//    }
//    boolean checkDigits(String s){
//        for(int i = 0; i < s.length(); i++){
//            char ch = s.charAt(i);
//            if (!Character.isDigit(ch)) return true;
//        }
//        return false;
//    }
//    String validateData() throws InputValidationException{
//        int Mlength = Mobile_number.length();
//        int Clength = customer_Id.length();
//        if(Mlength!=10)
//            throw new InputValidationException("Mobile number must be 10 digits");
//        if(Clength!=6)
//            throw new InputValidationException("Customer ID must be 6 digits");
//        if(checkDigits(Mobile_number))
//            throw new InputValidationException("Invalid Mobile Number");
//        if(checkDigits(customer_Id))
//            throw new InputValidationException("Invalid Customer ID");
//        int date = Integer.parseInt(bill_date.substring(0, bill_date.indexOf("-")));
//        int month = Integer.parseInt(bill_date.substring(bill_date.indexOf("-")+ bill_date.lastIndexOf("-")));
//        int monthd[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        if((date < 1 || date > 30) && (month<1 || month>12))
//            throw new InputValidationException("Invalid Date");
//    }
//}