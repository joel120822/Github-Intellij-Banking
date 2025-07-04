import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankManagement bank = new BankManagement();
        bank.addAccount(1,"joel",500);
        bank.addAccount(2,"jones",600);
        var scan = new Scanner(System.in);
        boolean running = true;
            System.out.println("Bank of baruda");
            System.out.println("---------------");
            System.out.println();
            System.out.print("enter account id:");
            int accountId = scan.nextInt();
            bank.findAccount(accountId);
        while (running){
            System.out.println();
            System.out.println("bank of baruda");
            System.out.println("---------------");
            System.out.println();
            System.out.println("choose an option below");
            System.out.println("1)account balance details");
            System.out.println("2)credit money");
            System.out.println("3) debit money");
            System.out.println("4)exit");
            System.out.print("choose an number: ");
            int number = scan.nextInt();
            switch (number) {
                case 1:
                    bank.findAccount(accountId);
                    System.out.println();
                    bank.printDetails(accountId);
                     break;
                case 2:
                    System.out.print(" amount to be credited: ");
                    double amount = scan.nextDouble();
                    System.out.println();
                    bank.addMoney(accountId,(int)amount);
                    break;
                case 3:
                    System.out.println("amount to be debited");
                    double money=scan.nextDouble();
                    System.out.println();
                    bank.debitMoney(accountId,money);
                    break;
                case 4:
                    System.out.println("welcome back");
                    running=false;
                    break;
                default:
                    System.out.println("give 1 to 4");

            }
        }
    }
}