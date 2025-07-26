class BankAccount{
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance, String accType){
        System.out.println(accType + " Account");
        this.accountNumber = accountNumber;
        this.balance = balance;
        displayBalance();
    }
    void deposite(double amount){
        balance += amount;
        System.out.println(amount + " Deposited successfully");
        displayBalance();
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println(amount + " Withdrew successfully");
            displayBalance();
        }
        else
            System.out.println("Insufficient funds, Check balance");
    }
    void displayBalance(){
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(int accountNumber, double balance, double interestRate, String accType){
        super(accountNumber, balance, accType);
        this.interestRate = interestRate;
    }
    void addInterest(){
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("After interest: " + balance);
    }
}
class CheckingAccount extends BankAccount{
    double overdraftLimit;
    CheckingAccount(int accountNumber, double balance, double overdraftLimit, String accType){
        super(accountNumber, balance, accType);
        this.overdraftLimit = overdraftLimit;
    }
    void withdraw(double amount){
        if(amount <= balance + overdraftLimit){
            double overdraft = amount - balance;
            overdraftLimit -= overdraft;
            System.out.println("Withdraw: " + amount);
            System.out.println("Overdraft used: " + overdraft);
        }
        else
            System.out.println("Overdraft limit exceeded");
    }
}
class FDAccount extends BankAccount{
    int termsInYears;
    double fdInterestRate;
    FDAccount(int accountNumber, double balance, int termsInYears, double fdInterestRate, String accType){
        super(accountNumber, balance, accType);
        this.termsInYears = termsInYears;
        this.fdInterestRate = fdInterestRate;
    }
    void calculateMaturityAmount(){
        double maturity = balance + (balance * fdInterestRate * termsInYears / 100);
        System.out.println("Maturity amount (after " + termsInYears + " years at " + fdInterestRate + "%): " + maturity);
    }
}
public class Main
{
	public static void main(String[] args) {
	    SavingsAccount sa = new SavingsAccount(123, 1000.0, 5.0, "Savings");
	    sa.addInterest();
	    System.out.println();
	    CheckingAccount ca = new CheckingAccount(123, 2000, 1000.0, "Checking");
	    ca.withdraw(2500.0);
	    System.out.println();
	    FDAccount fa = new FDAccount(123, 5000.0, 2, 6, "FD");
	    fa.calculateMaturityAmount();
	}
}