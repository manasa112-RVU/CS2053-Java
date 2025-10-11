class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}
class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Failed! Amount is not sufficient.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
}
public class Lab6 {
    public static void main(String[] args) {
        Account acc = new Account(1000);
        try {
            acc.withdraw(5000);  
        } 
        catch (LowBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } 
        finally {
            System.out.println("Transaction complete");
        }
    }
}