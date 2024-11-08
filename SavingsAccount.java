public class SavingsAccount extends BankAccount
{
   
   public boolean debit(int pPennies)
   {
      if(pPennies <= this.balance)
      {
         this.balance -= pPennies;
         return true;
      }
      else return false;
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
      String acctinfo = String.format("Type of Account : Savings\nAccount ID      : %s\nCurrent Balance : $%.2f\nInterest rate   : %.2f%%", this.accountID, tempBalance, this.interestRate * 100);
      return acctinfo;
   }
}