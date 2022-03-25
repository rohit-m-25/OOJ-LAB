/**Develop a Java program to create a class Bank that maintains two kinds of account for its 
customers, one called savings account and the other current account. The savings account 
provides compound interest and withdrawal facilities but no cheque book facility. The current 
account provides cheque book facility but no interest. Current account holders should also 
maintain a minimum balance and if the balance falls below this level, a service charge is 
imposed.
Create a class Account that stores customer name, account number and type of account. From 
this derive the classes Curr-acct and Sav-acct to make them more specific to their 
requirements. Include the necessary methods in order to achieve the following tasks:
Accept deposit from customer and update the balance.
Display the balance.
 Compute and deposit interest
Permit withdrawal and update the balance
 Check for the minimum balance, impose penalty if necessary and update the balanc */

import java.util.*;

 class bank{
     Scanner s=new Scanner(System.in);
     String acc,name;
     int bal=0;
     int s1;
     void Accept(){
         System.out.println("\n enter acc no and name : \n");
         acc=s.nextLine();
         name=s.nextLine();
     }
 void Display(){
     System.out.println("\n name: "+name+"\n acc no: "+acc+"bal: "+bal);
 }
 void deposit(){
     System.out.println("\n do you wish to deposit? y/n: \n");
     char c=s.next().charAt(0);
     if(c=='y'){
         System.out.println("\n enter amount \n");
         int a=s.nextInt();
         bal+=a;
         System.out.println("\n balance: "+bal);
     }
 }
 }
class cur extends bank{
     Scanner sc=new Scanner(System.in);
int ch=100;
void with(){
    System.out.println("\n enter amt: \n");
    int a=sc.nextInt();
    if(a>bal){
        System.out.println("\n insufficientt \n");
    }
    else{
        bal-=a;
        if(bal<1000){
            bal-=ch;
            System.out.println("\n charge added:  "+ch);
        }
        else
        System.out.println("\n "+a+" withdrawn \n");
    }
}
 }

 


 class save extends bank{
     Scanner sc=new Scanner(System.in);
     void interest(){
         System.out.println("\n cheque not available \n");
         System.out.println("\n enter rate,time, number of times \n");
         int r=sc.nextInt();
         int t=sc.nextInt();
         int n=sc.nextInt();
         int si= bal*(1+r/n);
         System.out.println("\n interest: "+Math.pow(si,(n*t)));

     }

     void with(){
         System.out.println("\n enter amount: \n");
         int a=sc.nextInt();
         if(a>bal)
         System.out.println("\n insufficient \n");
         else 
         {
             bal-=a;
             System.out.println("\n balance: "+bal);
         }
     }
 }
public class Classes {
    public static void main(String[] args){
    save s=new save();
    cur c= new cur();
    Scanner sc=new Scanner(System.in);
    System.out.println("\n 1.savings \n 2.current \n");
    int ch=sc.nextInt();
    switch(ch){
        case 1: s.Accept();
        s.Display();
        s.deposit();
        s.with();
        s.interest();
        break;
        case 2: c.Accept();
        c.Display();
        c.deposit();
        c.with();
        break;
        default:System.out.println("\n invalid \n");

    }

    
}
}
