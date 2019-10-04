package pkg17hcs4103;

import java.util.ArrayList;


/**
 *
 * @author c3
 */
public class Bank {
    static ArrayList<Account> acci=new ArrayList<>();
    static public int acc_count;
    static public int base=35678;
    public void addAccount(double balance,String n)
    {
        Account a=new Account(base++,balance,n);
        acci.add(a);
    }
    public double bankBalance()
    {
        double bb = 0;
//        for(Account a : acci)
//        {
//            bb += a.getBalance();
//        }
        
        double sum = acci.stream().map(Account::getBalance).reduce(0.0, (c,e)->c+e);
//        System.out.println(sum);
        return sum;
    }
    public long bankmax()
    {
        double max = 0;
        long ac_no = 0;
        for(Account a : acci)
        {
            if( a.getBalance() > max)
            {
                ac_no=a.account_no;
            }
        }
        
        return ac_no;
    }
    public long bankmin()
    {
        double min = acci.get(0).getBalance();
        long ac_no = acci.get(0).account_no;
        for(Account a : acci)
        {
            if( min > a.getBalance())
            {
                ac_no=a.account_no;
                min=a.getBalance();
            }
        }
        return ac_no;
    }
    public double accInfo(long ac_no)
    {
        double ba=0;
        for(Account a : acci)
        {
            if( ac_no == a.account_no)
            {
                ba=a.getBalance();
            }
        }
        return ba;
    }
    public int countac(double limit)
    {
        int count=0;
        for(Account a : acci)
        {
            if( limit <= a.getBalance())
            {
                count++;
            }
        }
        return count;
    }
    public Account getAccount(long ac)
    {
        for(Account a : acci)
        {
            if( ac == a.account_no)
            {
                return a;
            }
        }
        return null;
    }
            
}
