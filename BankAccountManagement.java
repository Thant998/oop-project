import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class BankAccount{
    String account;
    double balance;
    BankAccount(String account,double balance){
        this.account=account;
        this.balance=balance;
    }
}

class CertificateOfDeposits extends BankAccount{
    Date expiry;
    CertificateOfDeposits(String account, double balance) {
        super(account, balance);
    }
}

class CheckingAccount extends BankAccount{
    double limit;
    CheckingAccount(String account,double balance,double limit){
        super(account,balance);
        this.limit=limit;
    }
}
class SavingAccount extends BankAccount{
    double transfer;
    SavingAccount(String account,double balance,double transfer){
        super(account,balance);
        this.transfer=transfer;
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        CertificateOfDeposits cd = new CertificateOfDeposits("12345",1000.4);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            cd.expiry = format.parse("2019-12-31");
        } catch (ParseException e){
            e.printStackTrace();
        }

        CheckingAccount check=new CheckingAccount("223344",25060.3,10000000000.0);
        SavingAccount Save = new SavingAccount("212121",89935.4,34523.5);
        System.out.println(cd.account+" "+cd.balance+" "+cd.expiry);
        System.out.println(check.account+" "+check.balance+" "+check.limit);
        System.out.println(Save.account+" "+Save.balance+" "+Save.transfer);
    }
}