package Class_Practice;

class Bank
{
    int account;
    int balance;

    void printInfo()
    {
        System.out.printf("Account = %d, Balance = %d\n", account, balance);
    }
}

public class classify {
    public static void main(String [] args)
    {
        Bank cindy = new Bank();
        cindy.account = 111012048;
        cindy.balance = 0;

        Bank lichyo = new Bank();
        lichyo.account = 111016041;
        lichyo.balance = 100000;

        System.out.printf("lichyo : ");
        lichyo.printInfo();
        
        System.out.printf("Cindy : ");
        cindy.printInfo();

        cindy = lichyo;
        cindy.balance = 123;

        lichyo.printInfo();
    }
}
