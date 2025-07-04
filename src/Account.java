public class Account {
    private int bankId;
    private String name;
    private double amount;

    public Account(int bankId, String name, double amount) {
        this.bankId = bankId;
        this.name = name;
        this.amount = amount;
    }

    public int getBankId() {
        return bankId;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }
    public void printDetails(){
        System.out.println("account holder: "+getName());
        System.out.println("account balance: "+getAmount());
    }
    public void addAmount(double money){
        if(money<0){
            System.out.println("amount cant be in minus");
        }
        else {
            amount += money;
            System.out.println("new balanace: "+amount);
        }
    }

    public void debitMoney(double money){
        if(amount<money){
            System.out.println("cant debit because of insuffient balance");
        }
        else{
            amount=amount-money;
            System.out.println("new balanace: "+amount);
        }
    }

}
