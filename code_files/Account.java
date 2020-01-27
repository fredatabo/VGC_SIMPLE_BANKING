
public class Account {
    int accountNumber;
    String firstName;
    String lastName;
    double balance;
    String gender;
    String dateOpened;
  
   public Account(){
}
    
    public Account(String firstName, String lastName, String gender, double balance, String dateOpened)
    
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.gender = gender;
        this.dateOpened = dateOpened;
        
    }
    
    public void setBalance(double balance){
        if(balance > 0){
        this.balance = balance;
        }
    }
    
    public double getBalance(){
        return balance;
        
    }
    
    
     public void setFirstName(String firstName){
       this.firstName = firstName;
       
        
    }
    
    public String getFirstName(){
        return firstName;
        
    }
    
    
     public void setLastName(String lastName){
       this.lastName = lastName;
       
        
    }
    
    public String getLastName(){
        return lastName;
        
    }
    
    public void setGender(String gender){
       this.gender = gender;
       
        
    }
    
    public String getGender(){
        return gender;
        
    }
    
    
    public void setDateOpened(String dateOpened){
       this.dateOpened = dateOpened;
       
        
    }
    
    public String getDate(){
        return dateOpened;
        
    }
    
    
}
