import java.util.Scanner;

public class Account {

    //instance variables
    String accountName;
    String accountID;
    boolean hasAccount;
    double balance;
    double previousTransaction;

    //constructor to initalize variable
    public Account(String accountName, String accountID, boolean hasAccount, int balance, int previousTransaction) {
        this.accountName = accountName;
        this.accountID = accountID;
        this.hasAccount = hasAccount;

        this.balance = balance;
        this.previousTransaction = previousTransaction;
    }

    //Default constructor
    public Account() {
        this.accountName = "";
        this.accountID = "";
        this.hasAccount = false;
        this.balance = 0;
        this.previousTransaction = 0;
    }

    //overloaded constructor
    public Account(String accountName, String accountID) {
        this.accountName = accountName;
        this.accountID = accountID;
        this.hasAccount = false;
        this.balance = 0;
        this.previousTransaction = 0;
    }

    //getters/setters
    public String getaccountName() {return accountName;}

    public String getaccountID() {return accountID;}

    public boolean gethasAccount() {return hasAccount;}

    public double getbalance() {return balance;}

    public double getPreviousTransaction() {return previousTransaction;}

    public void setaccountName(String accountName) {this.accountName = accountName;}

    public void setAccountID() {this.accountID = accountID;}

    public void setHasAccount(boolean hasAccount) {this.hasAccount = hasAccount;}

    public void setbalance(double balance) {this.balance = balance;}

    public void setPreviousTransaction(double previousTransaction) {this.previousTransaction = previousTransaction;}

    //to string method
    public String toString() {
        if (hasAccount)
            return "The customer name is: " + accountName + ", the account ID is: " + accountID + " , " +
                    "the balance is: " + balance + " , the previous transaction amount is: "
                    + previousTransaction + " " + " " + ", the customer has an account.";
        else
            return "The customer name is: " + accountName + "The customer does not have an account";



    }
}
