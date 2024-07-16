import java.util.Scanner;
public class currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Withdrawal Amount");
        int amount =scanner.nextInt();
        if(amount > 50000||amount%100!=0){
            System.out.println("Max Limit Reached for withdrawalorInput amount should be multiple of 100");
            
        }
        else {
            int num2000 = amount/2000;
            amount %= 2000;

            int num200 = amount/200;
            amount %= 200;

            int num500 = amount/500;
            amount %= 500;

            int num100 = amount/100;
            amount %= 100;

            System.out.println("2000 Notes: "+num2000);
            System.out.println("500 Notes: "+num500);
            System.out.println("200 Notes: "+num200);
            System.out.println("100 Notes: "+num100);
        }
        scanner.close();
    }
}
