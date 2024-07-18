import java.util.*;
class ATM{
  float balance;
  int PIN = 5476;
  ATM(int PIN){
    this.PIN=PIN;
      menu();
  }
  public void menu(){
    System.out.println("enter your choice: ");
    System.out.println("1. check A/C balance");
    System.out.println("2. withdraw Money");
    System.out.println("3.deposit money");
    System.out.println("4. EXIT");
    Scanner sc=new Scanner(System.in);
    int opt= sc.nextInt();

    if(opt==1){
      checkBalance();
    }
    else if(opt==2){
      withdrawMoney();

    }
    else if(opt==3){
      depositMoney();
    }
    else if(opt==4){
      return;
    }
    else{
      System.out.println("enter valid choice: ");
    }
  }
  public void checkBalance(){
    System.out.println("Balance "+ balance);
    menu();
  }
  public void withdrawMoney(){
    System.out.println("enter amount to withdraw: ");
    Scanner sc= new Scanner(System.in);
    float amount= sc.nextFloat();
    if(amount > balance){
      System.out.println("insufficient money: "+ balance);
    }
    else{
      balance = balance-amount;
      System.out.println("money withdrawn successfully: ");
    }
    menu();

  }
  public void depositMoney(){
    System.out.println("enter the amount u want to deposit: ");
    Scanner sc=new Scanner(System.in);
    float amount = sc.nextFloat();
    balance = balance+amount;
    System.out.println("money deposit successfully: ");
    menu();
  }
}

class ATMMachine{
  public static void main(String[] args){
    ATM obj = new ATM(5476);
    // obj.checkPin();
  }
}