import java.util.*;

public class Main extends Account {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
       
        //simulate account Opening
        Operations op = new Operations("Joseph","Ola","Male",4500.0,"2019-01-02");
    
        // display customer's name and initial balance
        op.displayCustomerInfo();
       
       // get amount to be deposited
      op.setAmountDeposited(5000);
      //save the amount
     op.saveCash();
    System.out.println("Amount Deposited "+ op.getAmountDeposited());
    System.out.println(" Balance after deposit  " + op.getBalance());

   //set Amount to withdraw
    op.setAmountWithdrawn(3500);
  //withdraw cash
    op.withDrawCash();
   System.out.println("AmountWithdrawn " + op.getAmountWithdrawn());
  System.out.println(" Balance after withdrawing cash  " + op.getBalance());
 
  
     
    
        
        System.out.println("Total Remaining balance In Account "+ op.getBalance()
        );
        
        
    }
}

