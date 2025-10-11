abstract class Account {
    String name;
    double balance;

    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void display() {
        System.out.println("Account: " + name + "Balance: $" + balance);
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String name, double balance) {
        super(name, balance);
    }
    public void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Savings Interest (4%): $" + interest);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String name, double balance) {
        super(name, balance);
    }

    public void calculateInterest() {
        System.out.println("Current Account: No interest");
    }
}

class Lab4 {
    public static void main(String[] args) {
        Account[] accounts = {
            new SavingsAccount("John", 10000),
            new CurrentAccount("Keerthi", 5000)
        };

        for (Account acc : accounts) {
            acc.display();
            acc.calculateInterest();
            System.out.println();
        }
    }
}
