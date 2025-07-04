import java.util.ArrayList;
import java.util.List;

public class BankManagement {
    private List<Account> list = new ArrayList<>();


    public void addAccount(int id,String name, double intialAmount){
        list.add(new Account(id,name,intialAmount));

}
public Account findAccount(int id){
        for(var accountId:list){
            if(accountId.getBankId()==id){
                return accountId;
            }
            else{
                System.out.println("cant find id");
            }
        }

        return null;

}

public void printDetails(int id){
        var acc=findAccount(id);
        acc.printDetails();
}

public boolean addMoney(int id,int amount){
        var acc=findAccount(id);
        acc.addAmount(amount);
        return true;
}
public boolean debitMoney(int id,double money){
        var acc=findAccount(id);
        acc.debitMoney(money);
        return true;
}
}