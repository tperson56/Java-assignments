public class CheckingAccount extends BankAccount
{
    private int overdraftFee;
   
   public boolean debit(int pPennies)
   {
        this.balance -= pPennies;
      if(this.balance < 0)
      {
         this.balance -= overdraftFee;
         return true;
      }
      else return true;
   }
   
   public void setFee(int fee)
   {
    overdraftFee = fee;
   }

   public int getFee()
   {
    return overdraftFee;
   }

   public void applyInterest()
   {
      if(this.balance > 0)
      {
         balance += balance * this.interestRate;
      }
         
   }
   
   public String accountInfo()
   {
      double tempBalance = this.balance / 100.00;
      String acctinfo = String.format("Type of Account : Checking\nAccount ID      : %s\nCurrent Balance : $%.2f\nInterest rate   : %.2f%%\nOverdraft Fee   : $%.2f", this.accountID, tempBalance, this.interestRate * 100, (double)overdraftFee/100);
      return acctinfo;
   }
}