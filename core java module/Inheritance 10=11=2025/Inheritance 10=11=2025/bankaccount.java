class BankAccount {
    int accNo;
    String holderName;
    double balance;
    static int count = 0;

    BankAccount() {
        System.out.println("Default constructor of BankAccount");
        this.accNo = 0;
        this.holderName = "Unknown";
        this.balance = 0.0;
        count++;
    }

    BankAccount(int accNo, String holderName, double balance) {
        System.out.println("Parameterized constructor of BankAccount");
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
        count++;
    }

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }

    static int getCount() { return count; }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount() {
        super();
        this.interestRate = 4.0;
        System.out.println("Default constructor of SavingsAccount");
    }

    SavingsAccount(int accNo, String holderName, double balance, double interestRate) {
        super(accNo, holderName, balance);
        this.interestRate = interestRate;
        System.out.println("Parameterized constructor of SavingsAccount");
    }

    void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount() {
        super();
        this.overdraftLimit = 10000;
        System.out.println("Default constructor of CurrentAccount");
    }

    CurrentAccount(int accNo, String holderName, double balance, double overdraftLimit) {
        super(accNo, holderName, balance);
        this.overdraftLimit = overdraftLimit;
        System.out.println("Parameterized constructor of CurrentAccount");
    }

    void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

class Test {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(101, "Ravi", 50000, 5.5);
        CurrentAccount c = new CurrentAccount(202, "Amit", 100000, 20000);
        s.display();
        c.display();
        System.out.println("Total Accounts: " + BankAccount.getCount());
    }
}
