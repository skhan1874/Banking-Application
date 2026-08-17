import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.Scanner;



public class Assignment3 {
    public static void main(String[] args) throws FileNotFoundException {
    Scanner in = new Scanner(System.in);
        ArrayList<Accounts> Accountlist = new ArrayList<Accounts>();
        ArrayList<SavingAccount> Savinglist = new ArrayList<SavingAccount>();
        ArrayList<CheckingAccount> Checkinglist = new ArrayList<CheckingAccount>();
        String accountName;
        String accountID;
        boolean hasAccount = true;
        int balance = 0;
        int previousTransaction = 0;
        double interestRate = 0;
        int cardNumber = 0;

      Savinglist.add(new SavingAccount("Saif", "XE85303",
                true, 2000, 500, .05, 1000));
      Checkinglist.add(new CheckingAccount("Aaron" , "KO01928", true,
              3102, 742, 1.78, 8192));
      Accountlist.add(new Accounts("Alex", "YU18290", true,
              1201, 190));
      File myfile = new File("/Users/Khan/Documents/247Assignment3.txt");
        try {
            PrintWriter textout = new PrintWriter(myfile);
            textout.print(Savinglist);
            textout.close();
        } catch (FileNotFoundException e) {
            System.out.println("File pathname not found, please try again");
        }
        try {
            PrintWriter textout = new PrintWriter(myfile);
            textout.print(Checkinglist);
            textout.close();
        } catch (FileNotFoundException e) {
            System.out.println("File pathname not found, please try again");
        }
        try {
            PrintWriter textout = new PrintWriter(myfile);
            textout.print(Accountlist);
            textout.close();
        } catch (FileNotFoundException e) {
            System.out.println("File pathname not found, please try again");
        }
    }
}
