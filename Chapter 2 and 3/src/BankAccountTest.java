/**
 *  A class to test the BankAccount class.
 */
public class BankAccountTest
{
    public static void main(String[] args)
    {
         // create account # "111111" with balance of $10,000
        BankAccount acct1 = new BankAccount("111111", 10000);

        // create account # "000000" with balance of $0
        BankAccount acct2 = new BankAccount();
        
        // print the status of each account
        System.out.println("Account #" + acct1.getAccount() + 
        		" has initial balance of $" + acct1.getBalance());

        System.out.println("Account #" + acct2.getAccount() + 
        		" has initial balance of $" + acct2.getBalance() + "\n");

        // make a deposit to account 111111
        acct1.deposit(73.76);
        
        //changes account 000000 to 222222
        acct2.setAccountNumber("222222");
        // makes a withdrawal from account 222222
        acct2.withdraw(100);
        
        // print the new status of each account
        System.out.println("Account #" + acct1.getAccount() + 
        		" has a new balance of $" + acct1.getBalance());

        System.out.println("Account #" + acct2.getAccount() + 
        		" has a new balance of $" + acct2.getBalance() + "\n");
        
    }
}

/*
Account #111111 has initial balance of $10000.0
Account #000000 has initial balance of $0.0

Account #111111 has a new balance of $10073.76
Account #222222 has a new balance of $-100.0
 */
   

