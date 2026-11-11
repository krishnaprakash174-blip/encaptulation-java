import java.util.Scanner;

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

public class EncaptulationinJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1.register");
            System.out.println("2.Exit");

            System.out.print("Choose the one : ");
            int choice = sc.nextInt();
            if(choice == 1) {
                BankClass sbi = new BankClass(262002, 850000, "Krishna Prakash", "iob");
                System.out.println("Register Successfully");
                while(true) {
                    System.out.println("1.getbalance");
                    System.out.println("2.Exit");
                    System.out.println("Choose the one : ");
                    int choose = sc.nextInt();
                    if(choose == 1) {
                        iob.getBalance();
                    }
                    else if(choose == 2) {
                        break;
                    }
                    else {
                        break;
                    }
                }
            }

            else if(choice == 2) {
                System.out.println("Thank you for visiting");
                break;
            }
        }
    }
}