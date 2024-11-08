public class CreditcardAccount extends BankAccount
{
   private int limit;

   public boolean debit(int pPennies)
   {
      if(pPennies <= limit + this.balance )
      {
         this.balance -= pPennies;
         return true;
      }
      else return false;
   }
   
   public void setLimit(int pLimit){
    limit = pLimit; 
   }

    public int getLimit()
    {
        return limit;
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
      double tempBalance = this.balance / -100.00;
      String acctinfo = String.format("Type of Account : Creditcard\nAccount ID      : %s\nCurrent Balance : $%.2f\nInterest rate   : %.2f%%\nCredit Limit    : $%.2f", this.accountID, tempBalance, this.interestRate * 100), (double)limt;
      return acctinfo;
   }
}