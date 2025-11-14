class BankAccount 
{
    int accNo;
    String holderName;
    double balance;
    static int count = 0;

    BankAccount() {
      
        this.accNo = 0;
        this.holderName = "Unknown";
        this.balance = 0.0;
        count++;
    }

    BankAccount(int accNo, String holderName, double balance) {
     
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
        count++;
    }
	void withdraw()
	{
		System.out.println("check Amount");
	}
		
     

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }

    static int getCount() { return count; }
}

class SavingsAccount extends BankAccount 
{
    double interestRate;
	int accbalance=5000;

    SavingsAccount() {
        super();
        this.interestRate = 4.0;
       
    }

    SavingsAccount(int accNo, String holderName, double balance, double interestRate) {
        super(accNo, holderName, balance);
        this.interestRate = interestRate;
     
    }
	void withdraw()
	{
		
		if(accbalance>2000)
		{
			System.out.println("sufficient balance");
		}
		else
		{
			System.out.println("Unsufficient balance");
		}
	}
		

    void display() {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit=10000;
    double accBalance=10000;
	double amount=20000;
	

    CurrentAccount() {
        super();
        this.overdraftLimit = 10000;
        this.accBalance = 10000;
    }

    CurrentAccount(int accNo, String holderName, double balance, double overdraftLimit) {
        super(accNo, holderName, balance);
        this.overdraftLimit = overdraftLimit;
        this.accBalance = balance;
    }

    // Withdraw method considering overdraft limit
    void withdraw(double amount) {
        if (amount <= accBalance + overdraftLimit) {
            accBalance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + accBalance);
        } else {
            System.out.println("Withdrawal denied! Overdraft limit exceeded.");
        }
    }

    void display() {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}
class SalaryAccount extends BankAccount 
{
    double checklastdate;

    SalaryAccount() {
        super();
        this.checklastdate = 10000;
    }

    SalaryAccount(int accNo, String holderName, double balance, double checklastdate) {
        super(accNo, holderName, balance);
        this.checklastdate = checklastdate;
    }

    void display() {
        super.display();
        System.out.println("checklastdate Limit: " + checklastdate);
    }
}

class Test {
    public static void main(String[] args) {
	BankAccount w=new BankAccount();
	w.withdraw();
        SavingsAccount s = new SavingsAccount(101, "Prathmesh", 50000, 5.5);
	s.withdraw();
        CurrentAccount c = new CurrentAccount(202, "juned", 100000, 20000);
	c.withdraw();
	c.display();
	SalaryAccount  r= new SalaryAccount(101, "Prathmesh", 50000, 5.5);
	
        System.out.println("Total Accounts: " + BankAccount.getCount());
    }
}
