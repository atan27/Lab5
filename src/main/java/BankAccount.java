import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * Checks if bank type is checkings account
         */
        CHECKINGS,
        /**
         * Checks if bank type is savings account
         */
        SAVINGS,
        /**
         * Checks if bank type is student account
         */
        STUDENT,
        /**
         * Checks if bank type is workplace account
         */
        WORKPLACE
    }

    /**
     * Creates private int accountNumber.
     */
    private int accountNumber;
    /**
     * Creates private accountType.
     */
    private BankAccountType accountType;
    /**
     * Creates private double accountBalance.
     */
    private double accountBalance;
    /**
     * Creates private String ownerName.
     */
    private String ownerName;
    /**
     * Creates private double interestRate.
     */
    private double interestRate;
    /**
     * Creates private double interestEarned.
     */
    private double interestEarned;

    /**
     * Constructor for BankAccount.
     *
     * @param name            is the ownerName
     * @param accountCategory is the accountType
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        ownerName = name;
        accountType = accountCategory;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */

    /**
     * Gets the accountNumber in Bank class
     *
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the accountNumber to inputted number.
     *
     * @param setAccNum is the account number that will be set
     */
    public void setAccountNumber(final int setAccNum) {
        accountNumber = setAccNum;
    }

    /**
     * Gets the accountBalance.
     *
     * @return accountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the accountBalance as the inputted balance.
     *
     * @param theBalance is the balance that will be set
     */
    public void setAccountBalance(final double theBalance) {
        accountBalance = theBalance;
    }

    /**
     * Gets the name of the owner of the account.
     *
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the ownerName to inputted name
     *
     * @param nameOfOwner is the name of the owner that will be set
     */
    public void setOwnerName(final String nameOfOwner) {
        ownerName = nameOfOwner;
    }
}
