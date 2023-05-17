import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this(0, 0);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public String toString() {
        return "The account id " + id + ", created on " + dateCreated +
                ", has a current balance of $" + balance +
                " and a monthly interest of $" + getMonthlyInterest();
    }
}

// 1. Draw a UML class diagram as your OOP design for the above Account class and requirements.
//_____________________
//        |       Account       |
//        |_____________________|
//        | - id: int           |
//        | - balance: double   |
//        | - annualInterestRate: double |
//        | - dateCreated: Date |
//        |_____________________|
//        | + Account()         |
//        | + Account(id: int, balance: double) |
//        | + getId(): int      |
//        | + setId(id: int): void |
//        | + getBalance(): double |
//        | + setBalance(balance: double): void |
//        | + getAnnualInterestRate(): double |
//        | + setAnnualInterestRate(annualInterestRate: double): void |
//        | + getDateCreated(): Date |
//        | + getMonthlyInterestRate(): double |
//        | + getMonthlyInterest(): double |
//        | + withdraw(amount: double): void |
//        | + deposit(amount: double): void |
//        | + toString(): String |
//        |_____________________|
