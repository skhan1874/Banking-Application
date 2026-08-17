import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.PrintWriter;
import java.util.Scanner;

    public class BankAccounts<Savings1> {
     ArrayList<Account> Accountlist = new ArrayList<Account>();
     ArrayList<SavingAccount> SavingList = new ArrayList<SavingAccount>();
     ArrayList<CheckingAccount> CheckingList = new ArrayList<CheckingAccount>();


        public void Account() {
         Account accountname = new Account("Ja","TR43441",
                 true, 3400, 500);
        this.Accountlist.add(new Account("Ja" , "TR43441" ,
                true, 3400, 500));

        }

        public void SavingAccount() {
            SavingAccount save = new SavingAccount("Aaron" , "WR77912" , true,
                    2900, 50, 1.53, 434415207);
            this.SavingList.add(new SavingAccount("Aaron" , "WR77912" , true,
                    2900, 50, 1.53,434415207));

        }
        public static void main (String args[]) {
            Scanner in = new Scanner(System.in);
            String filename;
            File file;
            Scanner fileSc = new Scanner(new File(.txt));
        }

        public void CheckingAccount() {
            CheckingAccount check = new CheckingAccount("Bob" , "RW10281" , true,
                    2710, 50, 4.50, 1000 );
            this.CheckingList.add(new CheckingAccount("Bob" , "RW10281" , true,
                    2710, 50, 4.50, 1000 ));
        }

        File myfile = new File ("Users/Khan/Documents/247Assignment2.txt");
        {
            try {
                PrintWriter textout = new PrintWriter(myfile);
                textout.print(Accountlist);
            } catch (FileNotFoundException e) {
                System.out.println("File pathname is incorrect, please try again");
                e.printStackTrace();
            }
        }


    }
