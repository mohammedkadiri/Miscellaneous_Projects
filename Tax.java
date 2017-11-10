import java.util.Scanner;

public class Tax{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);// Create Scanner object
     double amount = 0, tax = 0; 
     int age = 0;
     
     System.out.println("Please enter yor age to be assesed if your liable to be taxed: ");
     age = input.nextInt();
     
     if(age < 18 || age > 65){
         System.out.println("Sorry you can't be taked as you are under the age of 18 or you are above the age of 65");
       }
       else{
       System.out.print("Please enter your taxable pay: ");
       amount = input.nextDouble();
         if(amount < 20000 ){
             tax = 0.25;
        }
        else{
         tax = 0.35;
      }
    }
        double taxTobePaid = amount * tax; // This is the tax to be paid
        double netPay = amount - tax; // This is the net pay
        System.out.println("This is the intial amount " + amount);
        System.out.println("This is the tax rate " + tax);
        System.out.println("this is the amount of tax to be paid " + taxTobePaid);
        System.out.print("This is net pay "+ netPay);
    }// end of main method execution 
}//end of class
