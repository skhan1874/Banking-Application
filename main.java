public class main {

    public static void main(String[] args){

        CheckingAccount[] checkingArr = new CheckingAccount[1];
        SavingAccount[] savingsArr = new SavingAccount[1];

        // Populate the array
        // String accountName,String accountID,etc
        System.out.println(checkingArr[0] = new CheckingAccount("Saif", "XE85303",
                true, 2000, 500, .05, 1000));

        //Arrays for savings accounts
        System.out.println(savingsArr [0] = new SavingAccount("Michael", "SW12345" ,
                true, 1500, 90, 0.13, 414145300));


    }
}
