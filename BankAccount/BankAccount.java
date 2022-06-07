package com.ace;

import java.util.*;

public class BankAccount {
    //Creating global Scanner object
    public static Scanner scr = new Scanner(System.in);

    //Data members
    static int id = 1000; //for unique ID
    String uid;
    String name;
    String address;
    String type;
    double balance;
    public static int no_of_trans = 0;

    //Default Constructor
    BankAccount(){
        uid = null;
        name=address=type=null;
    }

    BankAccount(String name,String address,String type,double balance){
        uid = UID();
        this.name = name;
        this.address = address;
        this.type = type;
        this.balance = balance;
    }

    //Generate unique ID
    String UID(){
        return "BA" +Integer.toString(id++);
    }

    //Display info and balance of depositer
    void display(){
        System.out.println("");
        System.out.println("|\t***ACCOUNT INFORMATION***");
        System.out.println("|");
        System.out.println("|     Name of Holder    : "+this.name);
        System.out.println("|     Account No        : "+this.uid);
        System.out.println("|     Account Type      : "+this.type);
        System.out.println("|     Available Balance : ₹"+this.balance);
        System.out.println("|     Address of Holder : "+this.address);
        System.out.println("|");
        System.out.println("");
    }

    //Deposit amount in account
    void deposit(){
        System.out.println("");
        System.out.println("Account No : "+this.uid);
        System.out.println("Name : "+this.name);
        System.out.print("Enter amount to be Deposited : ₹");
        double blnc = Double.parseDouble((scr.nextLine()));
        this.balance = this.balance + blnc;
        System.out.println("");
        System.out.println("Amount Credited Successfully...");
        System.out.println("");
        no_of_trans++;
    }

    //Withdraw from account
    void withdraw(){
        System.out.println("");
        System.out.println("Account No : "+this.uid);
        System.out.println("Name : "+this.name);
        System.out.print("Enter amount to be Withdrawn : ₹");
        double blnc = Double.parseDouble((scr.nextLine()));
        this.balance = this.balance - blnc;
        System.out.println("");
        System.out.println("Amount Debited Successfully...");
        System.out.println("");
        no_of_trans++;
    }

    //Change address of depositer
    void changeAddress(){
        System.out.println("");
        System.out.println("Account No : "+this.uid);
        System.out.println("Name : "+this.name);
        System.out.print("Enter New Address : ");
        this.address = scr.nextLine();
        System.out.println("");
        System.out.println("Address Successfully Changed...");
        System.out.println("");
    }

    public static void main(String args[]){

        //Enter no. of depositers
        System.out.print("Enter Numbers of depositers : ");
        int n= Integer.parseInt(scr.nextLine());

        //Creating array of objects(allocating memory)
        BankAccount[] bk = new BankAccount[n];

        //Enter informations of 'n' depositers
        for(int i=0;i<n;i++){
            System.out.println("Enter Information for Depositor no. "+(i+1));
            System.out.print("Enter name : ");
            String name = scr.nextLine();
            System.out.print("Type of Account : ");
            String type= scr.nextLine();
            System.out.print("Enter Address : ");
            String address = scr.nextLine();
            System.out.print("Enter Balance : ₹");
            double balance = Double.parseDouble(scr.nextLine());
            //Initialize elements of array object
            bk[i] = new BankAccount(name, address, type, balance);
            System.out.println("");
        }

        int num; //hold depositor no. to be manipulated

        //flag bit to exit from the loop
        int flag = 1;
        do{
            System.out.println("");
            System.out.println("MENU FOR ACCOUNT MANIPULATION");
            System.out.println("1. Print information of any depositor");
            System.out.println("2. Add amount to the account of any depositor");
            System.out.println("3. Remove some amount from account of any depositor");
            System.out.println("4. Change Address of any depositor");
            System.out.println("5. Print total number of transactions");
            System.out.println("6. Exit the program...");
            System.out.println("Enter your Choice : ");
            int choice = Integer.parseInt(scr.nextLine());
            System.out.println("");

            switch(choice){
                case 1:
                    System.out.print("Depositor no. : ");
                    num = Integer.parseInt(scr.nextLine());
                    bk[num-1].display();
                    break;
                case 2:
                    System.out.print("Depositor no. : ");
                    num = Integer.parseInt(scr.nextLine());
                    bk[num-1].deposit();
                    break;
                case 3:
                    System.out.print("Depositor no. : ");
                    num = Integer.parseInt(scr.nextLine());
                    bk[num-1].withdraw();
                    break;
                case 4:
                    System.out.print("Depositor no. : ");
                    num = Integer.parseInt(scr.nextLine());
                    bk[num-1].changeAddress();
                    break;
                case 5:
                    System.out.println("Total number of transactions today : "+no_of_trans);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    flag = 0;
                    break;
                default :
                    System.out.println("Wrong Choice!!!");
            }
        }while(flag == 1);
    }
}