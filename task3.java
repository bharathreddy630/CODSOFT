import java.util.*;
class task3{
    static int balance = 1000;
    static void withdraw(Scanner sc){
        System.out.println("Enter amount to withdraw:");
        int amount = sc.nextInt();
        if(amount<=balance){
            balance-=amount;
            System.out.println("Please collect your cash!!");
        }
        else{
            System.out.println("Insufficient balance!");
        }
        System.out.println("*****************");
    }
    static void deposit(Scanner sc){
        System.out.println("Enter amount to deposit:");
        int amount = sc.nextInt();
        if(amount>0){
            balance +=amount;
            System.out.println("Amount successfully deposited!");
        }
        else{
            System.out.println("Invalid amount to deposit");
        }
        System.out.println("*****************");
    }
    static void checkBalance(){
        System.out.println("Your current balanace is : "+balance);
        System.out.println("*****************");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Welcome to simple ATM!!");
        do{
            System.out.println("Enter your transaction");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    withdraw(sc);
                    break;
                case 2:
                    deposit(sc);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank You Visit Again !!");
                    break;
                default:
                    System.out.println("Enter the correct Transaction");
            }
        }while(choice!=4);
    }
}