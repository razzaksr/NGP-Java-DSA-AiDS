package dynamics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import oops.Account;

public class ImplementCompare {
    public static void main(String[] args) {
        List<Account> savings = Arrays.asList(
            new Account("Razak Mohamed S", 876567898765678L, 987.3),
            new Account("Nishant", 765676576677677L, 12000.3),
            new Account("Vikas karunakaran", 456787656734L, 8123.3)
        );
        // Collections.sort(savings,new NameAscending());
        Collections.sort(savings, new BalanceDescending());
        for (Account tempAccount : savings) {
            System.out.println(tempAccount);
        }
    }
}
class BalanceDescending implements Comparator<Account>{

    @Override
    public int compare(Account o1, Account o2) {
        return o2.getBalance().compareTo(o1.getBalance());
    }
    
}
class NameAscending implements Comparator<Account>{
    @Override
    public int compare(Account o1, Account o2) {
        return o1.getAccountHolderName().compareTo(o2.getAccountHolderName());
    }
    
}
