public class AccountTest {
    public static void main(String[] args) {
        // Create a new Account object
        Account account = new Account();

        // Set account details
        account.setId(1001);
        account.setBalance(20000);
        account.setAnnualInterestRate(0.5);

        // Print initial account status
        System.out.println("Initial Account Status:");
        System.out.println(account.toString());

        // Withdraw $2,500
        account.withdraw(2500);

        // Print account status after withdrawal
        System.out.println("\nAccount Status after Withdrawal of $2,500:");
        System.out.println(account.toString());

        // Deposit $3,000
        account.deposit(3000);

        // Print account status after deposit
        System.out.println("\nAccount Status after Deposit of $3,000:");
        System.out.println(account.toString());
    }
}
