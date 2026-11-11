
class BankClass {
    long acNo;
    private int balance;
    String name;
    String bank;

    public BankClass(long acNo, int balance, String name, String bank) {
        this.acNo = acNo;
        this.balance = balance;
        this.name = name;
        this.bank = bank;
    }

    void getBalance() {
        System.out.println("Balance Amount is :" + balance);
    }
}

public class Encap