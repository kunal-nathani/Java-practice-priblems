/**
 * BankAccountApp
 */
package com.techlabs.model;
public class BankAccountApp {
    private long accountNumber;
    private String userName;
    private double userBalance;
    private String accountType;

    public BankAccountApp(long accountNumber,String userName,double userBalance,String accountType){
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.userBalance = userBalance;
        this.accountType = accountType;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public void setuserName(String userName){
        this.userName = userName;
    }
    public void setuserBalance(double userBalance){
        this.userBalance = userBalance;
    }
    public void setAccountType(String accountType){
        this.accountType = accountType;
    }


    public double getUserBalance(){
        return this.userBalance;
    }
    public String getuserName(){
        return this.userName;
    }
    public long getaccountNumber(){
        return this.accountNumber;
    }
    public String getaccountType(){
        return this.accountType;
    }

    double amount;
    public void credit(double amount){
        if (amount>0) {
        userBalance += amount;
        System.out.println("Your Account"+accountNumber+"credited for"+amount+"Current Balance"+userBalance);
        }else{
            System.out.println("Kitna paisa chahiye bata bidu");
        }
    }

    public void debit(double amount){
        if(amount>userBalance){
            System.out.println("Paisa nai hai bidu");
        }else{
            userBalance-=amount;
            System.out.println("Tere Khate Number"+accountNumber+"Mein se"+amount+"paise nikale gaye hai aur abhi tere kahte mein"+userBalance+"itne hi paise hai bidu");
        }   
    }
    public void display(){
        System.out.println("Tere Khate Number"+this.accountNumber);
        System.out.println("Tera Naam"+this.userName);
        System.out.println("Khate Mein itne paise hai"+this.userBalance);
        System.out.println("Tere khate ka Prakar"+this.accountType);
    }
    
}