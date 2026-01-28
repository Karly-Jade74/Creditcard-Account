// Implement your CreditcardAccount class in this file

// Concrete derived class CreditcardAccount
public class CreditcardAccount extends BankAccount {
    private int limit = 0;

    public boolean debit(int amount) {
        if ((balance - amount) >= -limit) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
    
    public int getLimit() {
        return limit;
    }
    
    public void applyInterest() {
        if (balance < 0) {
            balance += (int) (balance * interestRate);
        }
    }
    
    public String accountInfo() {
        return String.format(
            "Type of Account : Creditcard\n" +
            "Account ID      : %s\n" +
            "Current Balance : $%.2f\n" +
            "Interest rate   : %.2f%%\n" +
            "Credit Limit    : $%.2f\n",
            accountID, Math.abs(balance) / 100.0, interestRate * 100, limit / 100.0
        );
    }
}
