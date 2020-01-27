import java.util.Date;
public class Operations extends Account{
    private double AmountDeposited;
    private double AmountWithdrawn;
    private Date date;
    
    public Operations(){
        
    }
    
    public Operations(String firstName, String lastName, String gender, double balance, String dateOpened)
    {
        super(firstName,lastName,gender,balance,dateOpened);
    }
    
    public void setAmountDeposited(double AmountDeposited){
        this.AmountDeposited = AmountDeposited;
    }
    
    public double getAmountDeposited(){
        return AmountDeposited;
    }
    
     public void setAmountWithdrawn(double AmountWithdrawn){
        this.AmountWithdrawn = AmountWithdrawn;
    }
    
    public double getAmountWithdrawn(){
        return AmountWithdrawn;
    }
    
    public void saveCash(){
      balance =  balance + getAmountDeposited();
        
    }
    
    
    
    public void withDrawCash(){
      balance =  balance - getAmountWithdrawn();
    }
        
    public double getBalance(){
    return super.getBalance();  
    }
    
    public void displayCustomerInfo(){
        System.out.println("Customer's Name "+ firstName + " " + lastName);
         System.out.println("Initial balance In Account "+ getBalance()
        );
        
        
        
        
    }
}
