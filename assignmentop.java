import java.util.Scanner;
public class assignmentop {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a 1st number value:");
        int num1 = obj.nextInt();
        System.out.println("Enter a 2nd number value:");
        int num2 = obj.nextInt();
        add(num1,num2);
        sub(num1,num2);
        mul(num1,num2);
        div(num1,num2);
    }
    public static int add(int num1,int num2){
        int add  = num1 + num2;
        System.out.println("Addition of "+ num1 +"+"+ num2 +"is"+add);
        return add;
    }
    public static int sub(int num1,int num2){
        int sub  = num1 - num2;
        System.out.println("Subraction of "+ num1 +"-"+ num2 +"is"+sub);
        return sub;
    } 
    public static int mul(int num1,int num2){
        int mul  = num1 * num2;
        System.out.println("multiplication of "+ num1 +"*"+ num2 +"is"+mul);
        return mul;
    }
    public static int div(int num1,int num2){
        int div  = num1 / num2;
        System.out.println("divsion of "+ num1 +"/"+ num2 +"is"+div);
        return div;
    }
}
