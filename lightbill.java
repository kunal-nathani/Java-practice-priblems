import java.util.Scanner;
public class lightbill{
    public static void main(String[] args) {
        int charge;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter No of units consumed");
        int units_consumed = obj.nextInt();
        int meter_charge=75;
        if(units_consumed>=100){
            if (units_consumed<=250) 
            {
             charge =  units_consumed*10;
            } else {
                charge = units_consumed*20;
            }
        }
            else{
                charge = units_consumed * 5;
            }
            int total =charge + meter_charge;
            System.out.println("Total water bill is:"+total);
        
    }
}