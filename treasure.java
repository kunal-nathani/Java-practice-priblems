import java.util.Scanner;
public class treasure{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Welcome to jumanji treasure Island.");
        System.out.println("Our mission is to find the treasure");
        System.out.println("Choose Move:go Left and go right");
        String option1 = obj.nextLine().toLowerCase(); 
        if (option1.equals("left")) {
        System.out.println("You have reached a lake do you want to swim or wait");
        String option2 = obj.nextLine().toLowerCase();
        if(option2.equals("wait")){
            System.out.println("Which coloured door you want to go in red,green,blue?");
            String option3 = obj.nextLine().toLowerCase();    
            
            if(option3.equals("red")){
                System.out.println("Burned in fire.Game over:((");
            }else if(option3.equals("blue")){
                System.out.println("Eaten by beasts.Game over:((");
            }else if(option3.equals("yellow")){
                System.out.println("You Win :))");
            }else{
                System.out.println("You Lose");
            }
            System.out.println("Attacked by a trout.Game over");
        }
        System.out.println("You entered room of beats.\n Game over");
        }
        obj.close();
    }
}