import java.util.Scanner;

class atmmenu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your balance: ");
        int balance = scanner.nextInt();
        System.out.println("Please choose an Option: ");
        int option;
        do{
            System.out.println("Atm Menu");
            System.out.println("1)Check Balance : ");
            System.out.println("2)Deposit Money:");
            System.out.println("3)Withdraw Money");
            System.out.println("4)EXIT");
            System.out.println("Please choose the Option:");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Your Account Balance is:"+balance);
                    break;
                
                case 2:
                    System.out.println("Enter amount you want to deposit");
                    int deposit_money = scanner.nextInt();
                    System.out.println("You have deposited $"+deposit_money+"Your Bank Balance is:"+(balance += deposit_money));

                case 3:
                    System.out.println("Enter amount to be withdraw:");
                    int Withdraw_money = scanner.nextInt();
                    if(Withdraw_money>balance){
                        System.out.println("Please note your withdrawal amount is exceeding your balance of:"+balance);
                        System.out.println("To Proceed enter yes/no");
                        String proceed = scanner.next().toLowerCase();

                        if (proceed.equals("yes")) {
                            System.out.println("Your account now is dept of $"+(balance -= Withdraw_money));
                        }else{
                            System.out.println("Your have withdraw $"+Withdraw_money+"Your Balance is:"+(balance -= Withdraw_money));
                        }
                        break;
                    }
                    case 4:
                        System.out.println("Thankyou for using our ATM.Thanking You.");
                        break;
                default:
                    System.out.println("Please enter valid option");
                    break;
            }
        }
        while(option<4);
    } 
}