public class CheckingAccount extends Account {
    double transactionFee;
    double spendingLimit;

    public CheckingAccount(String accountName, String accountID, boolean hasAccount, int balance,
                           int previousTransaction, double transactionFee, double spendingLimit) {
        super(accountName, accountID, hasAccount, balance, previousTransaction);
        this.transactionFee = transactionFee;
        this.spendingLimit = spendingLimit;

        System.out.println("The transaction fee for this checking account is: " + transactionFee +
                " and the spending limit is: " + spendingLimit);

        }
}
