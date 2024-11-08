// Copy and paste the code for your BankAccount class
// into this file
abstract class BankAccount{
   
    protected String accountID = "0000-0000-0000-0000";
    protected double interestRate;
    protected int balance;
    
  
    public boolean credit(int pPennies)
    {
       balance += pPennies;
       return true;
    }
    
    public abstract boolean debit(int pPennies);
    
    public int getBalance()
    {
       return balance;
    }
    
    public String getAccountID()
    {
       return accountID;
    }
    
    public void setAccountID(String id)
    {
       this.accountID = id;
    }
    
    public double getInterestRate()
    {
       return interestRate;
    }
    
    public void setInterestRate(double rate)
    {
       this.interestRate = rate;
    }
    
    public abstract void applyInterest();
    
    public abstract String accountInfo();
    
 }
    
       